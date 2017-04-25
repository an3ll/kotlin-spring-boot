@file:Suppress("unused")

package com.an3ll.service

import com.an3ll.data.Tables.USERS
import com.an3ll.data.tables.pojos.Users
import com.an3ll.data.tables.records.UsersRecord
import org.jooq.DSLContext
import org.springframework.stereotype.Service

@Service
class DefaultUserService(val dslContext: DSLContext) : UserService {

  override fun getUsers() = dslContext.selectFrom(USERS).fetchInto(Users::class.java).orEmpty()

  override fun createUser(user: Users) {
    val usersRecord = UsersRecord(null, user.firstName, user.lastName, user.email)
    dslContext.insertInto(USERS).set(usersRecord).execute()
  }
}
