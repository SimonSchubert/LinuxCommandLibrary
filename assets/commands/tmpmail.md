# TAGLINE

Temporary disposable email from terminal

# TLDR

**Generate address**

```tmpmail -g```

**Check inbox**

```tmpmail```

**Read email by ID**

```tmpmail [email-id]```

**Copy address**

```tmpmail -c```

**Different domain**

```tmpmail -g [domain]```

**Recent emails**

```tmpmail -r```

# SYNOPSIS

**tmpmail** [_-g_] [_-c_] [_-r_] [_options_] [_id_]

# PARAMETERS

**-g**
> Generate address.

**-c**
> Copy to clipboard.

**-r**
> Recent emails.

**-b** _BROWSER_
> Browser to open.

**--help**
> Show help.

# DESCRIPTION

**tmpmail** generates temporary, disposable email addresses and lets you check their inbox directly from the terminal. It is useful for signing up for services without exposing your real email address to potential spam.

The tool creates addresses on supported temporary email domains and retrieves incoming messages for viewing in the terminal or a browser. The current address can be copied to the clipboard with **-c** for quick pasting into registration forms.

# CAVEATS

External service dependent. May have limits. Not for sensitive use.

# HISTORY

**tmpmail** was created for generating temporary email addresses and checking them from the command line.

# SEE ALSO

[mail](/man/mail)(1), [mutt](/man/mutt)(1), [curl](/man/curl)(1)
