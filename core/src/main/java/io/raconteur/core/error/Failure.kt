package io.raconteur.core.error

sealed class Failure(open val message: String? = null) {
    data class NetworkFailure(override val message: String? = null): Failure(message)
    data class UnknownFailure(override val message: String? = null): Failure(message)
}
