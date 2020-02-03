package ru.samolovov.soran.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class TeamNotFoundException(id: Long): RuntimeException("Team with id=$id not found")

@ResponseStatus(HttpStatus.NOT_FOUND)
class PlayerNotFoundException(id: Long): RuntimeException("Player with id=$id not found")