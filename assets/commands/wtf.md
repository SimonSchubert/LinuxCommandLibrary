# TAGLINE

Acronym lookup and expansion

# TLDR

**Expand** acronym

```wtf [IMO]```

Search **computer** terms

```wtf -t comp [WWW]```

# SYNOPSIS

**wtf** [_OPTIONS_] _ACRONYM_

# PARAMETERS

_ACRONYM_
> One or more acronyms to look up. Multiple words are joined; case is ignored.

**-f** _FILE_
> Use _FILE_ as an additional acronym database (one _ACRONYM<TAB>expansion_ per line).

**-o**
> Print expansions even when running in the **is** alias mode (_what is_ acronym).

**-t** _TYPE_
> Restrict the lookup to a named acronym category. Default categories include _comp_ (computers), and any extra files installed under **/usr/share/games/bsdgames/wtf/** or your local **acronyms** files.

# DESCRIPTION

**wtf** expands acronyms by looking them up in a local database, returning all known meanings. It is part of **bsdgames** and ships with both a general acronym list and topical lists (e.g., **comp** for computer jargon).

A bare invocation searches the default database; **-t** narrows the search to a particular acronym list. To extend the database, drop additional acronym files into the same directory or pass them with **-f**.

# CAVEATS

Database may not include all acronyms. Some acronyms have multiple meanings. Primarily Unix/hacker jargon focused.

# HISTORY

**wtf** stands for "What The F..." and is part of the bsdgames package, originating from BSD Unix culture.

# INSTALL

```apk: sudo apk add wmutils```

```zypper: sudo zypper install wmutils```

```brew: brew install wtf```

```nix: nix profile install nixpkgs#wtf```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[whatis](/man/whatis)(1), [apropos](/man/apropos)(1)
