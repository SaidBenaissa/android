
package com.owncloud.android.domain.server.usecases

import com.owncloud.android.domain.server.ServerRepository
import com.owncloud.android.domain.sharing.shares.usecases.BaseUseCase

class CheckPathExistenceUseCase (
    private val serverRepository: ServerRepository
    ) : BaseUseCase<Boolean, CheckPathExistenceUseCase.Params>() {
    override fun run(params: Params): Boolean =
        serverRepository.checkPathExistence(params.remotePath, params.userLogged)

    data class Params(
        val remotePath: String,
        val userLogged: Boolean
    )
}
