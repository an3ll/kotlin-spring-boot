package com.an3ll.service.api

import com.an3ll.data.tables.pojos.Users

interface UserService {
  fun getUsers(): List<Users>
  fun createUser(user: Users)
  fun getUser(userId: String): Users
}
