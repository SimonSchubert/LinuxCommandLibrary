# TLDR

Open **alpine** email client

```alpine```

Open alpine directly to **compose** an email

```alpine [email@example.net]```

**Quit** alpine

```q y```

# SYNOPSIS

**alpine** [_options_] [_address_]

# DESCRIPTION

**alpine** is an email client and Usenet newsgroup program with a pico/nano-inspired interface. It supports most modern email services through IMAP and is designed for ease of use with a menu-driven interface.

Alpine is the successor to Pine and was developed by the University of Washington.

# PARAMETERS

**address**
> Open directly to message composition screen to send to specified address

**-i**
> Start in the INBOX folder

**-f folder**
> Open a specific folder

**-c context**
> Set folder collection context

**-d debug_level**
> Enable debugging output

**-p pinerc**
> Use alternate configuration file

# CAVEATS

Configuration is stored in ~/.pstrict by default. Alpine may require additional setup for OAuth2 authentication with modern email providers like Gmail.

# HISTORY

Alpine was developed by the **University of Washington** as a successor to **Pine** (Program for Internet News & Email). First released in **2007**, it was designed to address licensing concerns with Pine.

# SEE ALSO

[mutt](/man/mutt)(1), [mail](/man/mail)(1), [pico](/man/pico)(1), [nano](/man/nano)(1)
