# TAGLINE

Smart directory changer with learning

# TLDR

**Change to bookmarked directory**

```scd [bookmark]```

**Add bookmark**

```scd --add [name]```

**List bookmarks**

```scd --list```

**Remove bookmark**

```scd --remove [name]```

**Search and jump**

```scd [partial-match]```

# SYNOPSIS

**scd** [_--add name_] [_--list_] [_--remove name_] [_bookmark_]

# PARAMETERS

**--add** _NAME_
> Add current as bookmark.

**--list**
> Show all bookmarks.

**--remove** _NAME_
> Delete bookmark.

**-a**
> All matching dirs.

**--help**
> Show help.

# DESCRIPTION

**scd** is a smart directory changer that enhances shell navigation through bookmarks and directory usage learning. It replaces the standard **cd** command with an intelligent alternative that remembers frequently visited paths and supports fuzzy matching, so partial directory names are enough to navigate.

The bookmark system allows saving important directories by name for instant access. When navigating without an exact match, scd uses its learned history of directory visits to suggest the most likely target, ranking results by frequency and recency of use.

Shell integration makes scd a transparent replacement for cd in bash, zsh, and other shells. Once configured, it intercepts directory changes to build its knowledge base while providing the same familiar interface.

# CAVEATS

Requires shell setup. History-based learning. Shell-specific config.

# HISTORY

**scd** provides smart directory changing with bookmarks and learning capabilities, enhancing shell navigation.

# SEE ALSO

[cd](/man/cd)(1), [z](/man/z)(1), [autojump](/man/autojump)(1), [fasd](/man/fasd)(1)
