# TAGLINE

Edit and delete Telegram messages from the command line

# TLDR

**Delete all messages matching text in a chat**

```tgutil -n [session] -u [chat_id] -m deleteall --text "[text]"```

**Edit a specific message**

```tgutil -n [session] -u [me] -m edit --text "[old text]" --newtext "[new text]"```

**Edit all matching messages**

```tgutil -n [session] -u [chat_id] -m editall --text "[old text]" --newtext "[new text]"```

**Delete a single matching message in saved messages**

```tgutil -n [session] -u [me] -m delete --text "[text]"```

# SYNOPSIS

**tgutil** **-n** _session_ **-u** _chat_ **-m** _mode_ **--text** _text_ [**--newtext** _text_]

# PARAMETERS

**-n**, **--name** _SESSION_
> Session name (authenticated Telegram account).

**-u**, **--username** _CHAT_
> Target chat ID or username. Use `me` for Saved Messages.

**-m**, **--mode** _MODE_
> Operation mode: `edit`, `editall`, `delete`, `deleteall`.

**--text** _TEXT_
> Text to search for in messages.

**--newtext** _TEXT_
> Replacement text (required for `edit` and `editall` modes).

# DESCRIPTION

**tgutil** is a CLI tool for editing and deleting messages in Telegram chats. It is part of the **telegram-cloud** Python package, which provides a suite of tools for interacting with Telegram from the command line.

The tool operates in four modes: `edit` modifies the first matching message, `editall` modifies all matching messages, `delete` removes the first matching message, and `deleteall` removes all matching messages containing the specified text.

Install via pip: `pip install telegram-cloud`.

# CAVEATS

Requires prior authentication via **tglogin** with a Telegram API id and hash from https://my.telegram.org. Part of the **telegram-cloud** package. Can only edit or delete your own messages.

# SEE ALSO

[tgsend](/man/tgsend)(1), [tgcloud](/man/tgcloud)(1), [tginfo](/man/tginfo)(1)
