# TLDR

**Tag files**

```tmsu tag [file] [tag1] [tag2]```

**List tags**

```tmsu tags```

**Find by tag**

```tmsu files [tag]```

**Find by multiple tags**

```tmsu files [tag1] and [tag2]```

**Untag file**

```tmsu untag [file] [tag]```

**Mount virtual filesystem**

```tmsu mount [mountpoint]```

# SYNOPSIS

**tmsu** _command_ [_options_] [_args_]

# PARAMETERS

**tag**
> Add tags.

**tags**
> List tags.

**files**
> Query files.

**untag**
> Remove tags.

**mount**
> Mount FUSE fs.

**rename**
> Rename tag.

# DESCRIPTION

**tmsu** tags files. It provides a tag-based filesystem.

File tagging system. Organize by tags.

Query by tags. Boolean expressions.

FUSE mount support. Virtual directories.

SQLite storage. Local database.

# CAVEATS

FUSE needed for mount. Database per directory. Go-based tool.

# HISTORY

**TMSU** (Tag My Stuff Unix) was created for file organization using tags with optional FUSE filesystem support.

# SEE ALSO

[find](/man/find)(1), [locate](/man/locate)(1), [tag](/man/tag)(1)
