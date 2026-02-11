# TAGLINE

Mail delivery agent with recipe-based filtering

# TLDR

**Deliver mail using recipes**

```procmail < [email.txt]```

**Test recipe file**

```procmail -m [VERBOSE=on] [recipe] < [email.txt]```

**Specify maildir**

```procmail -d [maildir]```

# SYNOPSIS

**procmail** [_options_] [_parameters_] [_recipes_...]

# DESCRIPTION

**procmail** is a mail delivery agent and filtering program. It sorts incoming mail into folders based on rules defined in .procmailrc, enabling automatic mail organization.

The tool can filter spam, sort mailing lists, forward mail, and execute scripts based on message content.

# PARAMETERS

**-d** _maildir_
> Delivery directory.

**-m** [_params_]
> Use as filter.

**-t**
> Fail if not run as daemon.

**-v**
> Verbose mode.

**-f** _fromline_
> Set From line.

# RECIPE FORMAT

```
:0 [flags] [:lockfile]
* condition
action
```

**Flags**: H=header, B=body, h=header to pipe, b=body to pipe

# CONFIGURATION

**~/.procmailrc**
> User-level recipe file defining mail filtering rules, delivery actions, and variable settings like MAILDIR and LOGFILE.

**~/.forward**
> Mail forwarding file that pipes incoming mail to procmail, typically containing `"|IFS=' ' && exec /usr/bin/procmail -f- || exit 75"`.

**/etc/procmailrc**
> System-wide recipe file applied to all users before individual .procmailrc rules.

# CAVEATS

Complex recipe syntax. Security requires careful configuration. Largely superseded by server-side filters. Maintenance can be tricky.

# HISTORY

**procmail** was written by **Stephen van den Berg** starting in **1990**. It became the standard Unix mail filtering tool, though its usage has declined with webmail and server-side filtering. It's still used for advanced local mail processing.

# SEE ALSO

[fetchmail](/man/fetchmail)(1), [formail](/man/formail)(1), [maildir](/man/maildir)(5), [sieve](/man/sieve)(5)
