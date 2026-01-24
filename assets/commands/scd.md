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

**scd** provides smart cd. It bookmarks and learns directories.

Fuzzy matching support. Partial names work.

Learns frequent directories. Auto-suggestions.

Bookmark system. Save important paths.

Shell integration. Replaces cd.

# CAVEATS

Requires shell setup. History-based learning. Shell-specific config.

# HISTORY

**scd** provides smart directory changing with bookmarks and learning capabilities, enhancing shell navigation.

# SEE ALSO

[cd](/man/cd)(1), [z](/man/z)(1), [autojump](/man/autojump)(1), [fasd](/man/fasd)(1)
