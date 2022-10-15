package com.example.reply.ui

import com.example.reply.data.Email
import com.example.reply.data.boxType
import com.example.reply.data.local.LocalEmailsDataProvider

data class ReplyUiState(
    val mailboxes: Map<boxType, List<Email>> = emptyMap(),
    val currentMailbox: boxType = boxType.Events,
    val currentSelectedEmail: Email = LocalEmailsDataProvider.defaultEmail,
    val isShowingHomepage: Boolean = true
) {
    val currentMailboxEmails: List<Email> by lazy { mailboxes[currentMailbox]!! }
}
