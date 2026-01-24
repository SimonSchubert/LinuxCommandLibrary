# TLDR

**Login to LastPass**

```lpass login [user@example.com]```

**Show password for a site**

```lpass show --password [sitename]```

**Copy password to clipboard**

```lpass show --clip --password [sitename]```

**List all accounts**

```lpass ls```

**Search for entries**

```lpass show -G [pattern]```

**Add a new password**

```lpass add [Folder/sitename]```

**Generate a password**

```lpass generate [sitename] [20]```

**Logout**

```lpass logout```

# SYNOPSIS

**lpass** _command_ [_options_] [_arguments_]

# PARAMETERS

**login** _EMAIL_
> Authenticate with LastPass.

**logout**
> End session and clear cache.

**show** _NAME_
> Display entry details.

**ls** [_GROUP_]
> List entries, optionally filtered by group.

**add** _NAME_
> Add new entry interactively.

**edit** _NAME_
> Modify existing entry.

**rm** _NAME_
> Delete entry.

**generate** _NAME_ _LENGTH_
> Generate and store random password.

**sync**
> Synchronize local cache with server.

**export**
> Export vault as CSV.

**import** _FILE_
> Import entries from CSV.

**--password**
> Show only password field.

**--username**
> Show only username field.

**--url**
> Show only URL field.

**--clip**, **-c**
> Copy to clipboard instead of printing.

**-G**, **--basic-regexp**
> Match using regular expression.

**--sync=auto|now|no**
> Control synchronization behavior.

**--color=auto|always|never**
> Color output control.

# DESCRIPTION

**lpass** is the command-line interface for LastPass password manager. It provides full access to your vault from the terminal, enabling scripted password retrieval and management.

Authentication creates an encrypted local cache. The agent keeps your session active, avoiding repeated master password entry. Session timeout is configurable via LPASS_AGENT_TIMEOUT environment variable.

Entries are organized in folders with full paths (e.g., "Work/email"). Fields include username, password, URL, and notes. Secure notes store arbitrary text. Custom fields are supported.

For automation, **--clip** pipes to clipboard utilities, and **--password** outputs just the credential for use in scripts. The **generate** command creates random passwords meeting complexity requirements.

Sharing and enterprise features accessible via the web vault are partially supported. Two-factor authentication works with TOTP apps.

# CAVEATS

Requires internet for initial sync. Local cache is encrypted but exists on disk. Clipboard contents may be logged by some systems. Agent timeout affects security vs convenience tradeoff. Some enterprise features unavailable via CLI. LastPass data breaches (2022) raised security concerns.

# HISTORY

**lpass** was developed by **LastPass** and released as open source around **2014**. It provides command-line access to the LastPass service, which was founded in **2008**. LastPass was acquired by LogMeIn in **2015** and later sold to private equity. The CLI tool remains popular for automation and terminal-based workflows despite competition from tools like Bitwarden and 1Password.

# SEE ALSO

[pass](/man/pass)(1), [rbw](/man/rbw)(1), [gopass](/man/gopass)(1), [keepassxc-cli](/man/keepassxc-cli)(1)
