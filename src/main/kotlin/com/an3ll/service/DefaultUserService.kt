package com.an3ll.service

import com.an3ll.data.Tables.USERS
import com.an3ll.data.tables.pojos.Users
import com.an3ll.data.tables.records.UsersRecord
import com.an3ll.exception.DuplicateItemException
import com.an3ll.exception.ItemNotFoundException
import com.an3ll.service.api.UserService
import org.jooq.DSLContext
import org.springframework.dao.DuplicateKeyException
import org.springframework.stereotype.Service

@Service
class DefaultUserService(val dslContext: DSLContext) : UserService {

  override fun getUsers() = dslContext.selectFrom(USERS).fetchInto(Users::class.java).orEmpty()

  override fun getUser(userId: String) = dslContext.selectFrom(USERS).where(USERS.ID.eq(userId.toInt())).fetchOneInto(Users::class.java) ?: throw ItemNotFoundException()

  override fun createUser(user: Users) {
    val usersRecord = UsersRecord(null, user.firstName, user.lastName, user.email)
    try {
      dslContext.insertInto(USERS).set(usersRecord).execute()
    } catch (e: DuplicateKeyException) {
      throw DuplicateItemException()
    }
  }
}
