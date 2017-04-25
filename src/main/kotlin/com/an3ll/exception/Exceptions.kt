package com.an3ll.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Item not found.")
class ItemNotFoundException: RuntimeException()

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Duplicate item found")
class DuplicateItemException: RuntimeException()
