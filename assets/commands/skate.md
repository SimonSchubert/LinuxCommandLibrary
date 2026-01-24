# TLDR

**Set a value**

```skate set [key] [value]```

**Get a value**

```skate get [key]```

**List all keys**

```skate list```

**Delete a key**

```skate delete [key]```

**Set from stdin**

```echo "[value]" | skate set [key]```

**Use specific database**

```skate set [key] [value] -d [mydb]```

**Sync to GitHub**

```skate sync```

**Link to GitHub gist**

```skate link [gist_url]```

# SYNOPSIS

**skate** _command_ [_-d database_] [_options_] [_args_]

# PARAMETERS

**set** _KEY_ _VALUE_
> Store value.

**get** _KEY_
> Retrieve value.

**list**
> List all keys.

**delete** _KEY_
> Remove key.

**sync**
> Sync with remote.

**link** _URL_
> Link to gist.

**-d**, **--database** _NAME_
> Database name.

**--help**
> Show help.

# DESCRIPTION

**skate** is a personal key-value store. It provides simple storage from the command line.

Key-value pairs store any text data. API keys, notes, snippets, etc.

Multiple databases organize data. Switch with -d flag.

GitHub gist sync backs up data. Share across machines.

Stdin support enables piping. Store command output directly.

# CAVEATS

Data stored locally by default. Gist sync requires GitHub auth. Not for sensitive secrets.

# HISTORY

**Skate** is part of **Charm** tools, created by Charm for beautiful terminal experiences. It provides simple, elegant key-value storage.

# SEE ALSO

[pass](/man/pass)(1), [secret-tool](/man/secret-tool)(1)
