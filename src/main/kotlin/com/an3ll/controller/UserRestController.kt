package com.an3ll.controller

import com.an3ll.data.tables.pojos.Users
import com.an3ll.service.api.UserService
import org.springframework.web.bind.annotation.*

@RestController
class UserRestController(val usersService: UserService) {

  @GetMapping("/rest/users")
  fun getUsers() = usersService.getUsers()

  @PostMapping("/rest/users")
  fun createUser(@RequestBody user: Users) = usersService.createUser(user)
}
