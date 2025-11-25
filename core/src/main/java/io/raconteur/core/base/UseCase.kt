package io.raconteur.core.base

interface UseCase<in P, out R> {
    suspend operator fun invoke(params: P): R
}

