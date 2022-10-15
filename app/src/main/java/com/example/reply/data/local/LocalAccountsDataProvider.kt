/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.reply.data.local

import com.example.reply.R
import com.example.reply.data.Account

object LocalDataProvider {
    val defaultAccount = Account(-1, "", "", R.drawable.avatar_04)

    val userAccount =
        Account(
            id = 1,
            firstName = "College Body",
            email = "aawesomeville@example.com",
            avatar = R.drawable.avatar_05
        )

    private val allUserContactAccounts = listOf(
        Account(
            id = 4,
            firstName = "College Event",
            email = "aliconnors@example.com",
            avatar = R.drawable.avatar02
        ),
        Account(
            id = 7,
            firstName = "GDSC MESCOE",
            email = "express-commerce@example.org",
            avatar = R.drawable.avatar01
        ),
        Account(
            id = 9,
            firstName = "ElectroInfinity Club",
            email = "li.yang1988@example.com",
            avatar = R.drawable.avatar_04
        ),
        Account(
            id = 11,
            firstName = "Robo Club",
            email = "schow@example.com",
            avatar = R.drawable.avatar03
        ),
        Account(
            id = 12,
            firstName = "Student Tasks",
            email = "spam@example.com",
            avatar = R.drawable.avatar_06
        )
    )

    /**
     * Get the contact of the current user with the given [accountId].
     */
    fun getContactAccountById(accountId: Int): Account {
        return allUserContactAccounts.firstOrNull { it.id == accountId }
            ?: allUserContactAccounts.first()
    }
}
