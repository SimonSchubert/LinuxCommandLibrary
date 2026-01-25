# TLDR

**Start Pine mail client**

```pine```

**Open specific folder**

```pine -f [folder]```

**Send message from command line**

```pine -I [address] -subject "[subject]"```

**Start in setup mode**

```pine -conf```

# SYNOPSIS

**pine** [_options_] [_address_]

# PARAMETERS

**-f** _folder_
> Open specific folder.

**-I** _address_
> Initial address.

**-subject** _text_
> Message subject.

**-conf**
> Configure mode.

**-n** _num_
> Start at message number.

# DESCRIPTION

**pine** (Program for Internet News and Email) is a character-based email and news client. Developed at University of Washington, it was widely used for its user-friendly interface.

Now succeeded by Alpine.

# MAIN MENU

```
?  HELP
C  COMPOSE MESSAGE
I  MESSAGE INDEX
L  FOLDER LIST
A  ADDRESS BOOK
S  SETUP
Q  QUIT
```

# EXAMPLES

```bash
# Start Pine
pine

# Compose to address
pine user@example.com

# Read specific folder
pine -f ~/mail/inbox
```

# CONFIGURATION

Configuration stored in ~/.pstrinerc. Use S (Setup) from main menu for interactive configuration.

# CAVEATS

Pine is obsolete; use Alpine instead. Not all features work with modern mail servers. License issues led to Alpine fork.

# HISTORY

Pine was developed at the **University of Washington** starting in 1989 by **Mark Crispin** and later superseded by **Alpine** under Apache license.

# SEE ALSO

[alpine](/man/alpine)(1), [mutt](/man/mutt)(1), [mail](/man/mail)(1)
