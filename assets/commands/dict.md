# TLDR

**Look up a word** definition

```dict [word]```

**Look up in specific** dictionary

```dict -d [wn] [word]```

**List available dictionaries**

```dict -D```

**Find matching words** (wildcard)

```dict -m [word*]```

**Use specific server**

```dict -h [dict.org] [word]```

**Show database information**

```dict -i [wn]```

# SYNOPSIS

**dict** [_options_] _word_

# PARAMETERS

_WORD_
> Word or phrase to look up.

**-d** _DATABASE_
> Search specific dictionary database.

**-D**
> List available databases.

**-m**
> Match mode (find similar words).

**-s** _STRATEGY_
> Search strategy for matching.

**-S**
> List available strategies.

**-h** _HOST_
> Connect to specified DICT server.

**-p** _PORT_
> Port number (default: 2628).

**-i** _DATABASE_
> Show database information.

**--help**
> Display help information.

# DESCRIPTION

**dict** is a command-line client for DICT protocol dictionary servers. It provides access to various dictionaries and thesauri hosted on DICT servers, returning definitions, synonyms, and related information.

The DICT protocol allows querying multiple dictionaries simultaneously. The default public server (dict.org) hosts numerous dictionaries including WordNet, Jargon File, and various language dictionaries.

dict supports different search strategies including exact match, prefix, suffix, and regular expression matching. This flexibility helps find words even with uncertain spelling.

# CAVEATS

Requires network connectivity to DICT servers. Available dictionaries depend on server. Response time varies with network conditions. Some dictionaries have licensing restrictions.

# HISTORY

The dict client implements the **DICT protocol** (RFC 2229), developed in **1997** as a standard for dictionary server access. The protocol was designed to provide a universal interface for dictionary lookups over the Internet.

# SEE ALSO

[dictd](/man/dictd)(8), [curl](/man/curl)(1), [aspell](/man/aspell)(1)
