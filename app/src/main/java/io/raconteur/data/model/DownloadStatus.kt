package io.raconteur.data.model

sealed class DownloadStatus {
    object NotDownloaded : DownloadStatus()
    object Downloading : DownloadStatus()
    data class Downloaded(val filePath: String) : DownloadStatus()
}