# TAGLINE

Tag-based file organization system

# TLDR

**Tag files**

```tmsu tag [file] [tag1] [tag2]```

**List tags**

```tmsu tags```

**Find by tag**

```tmsu files [tag]```

**Find by multiple tags** (boolean query)

```tmsu files [tag1] and [tag2]```

**Untag file**

```tmsu untag [file] [tag]```

**Mount virtual filesystem** organized by tags

```tmsu mount [mountpoint]```

**Show tags** for a specific file

```tmsu tags [file]```

**Check status** of tagged files

```tmsu status```

# SYNOPSIS

**tmsu** _command_ [_options_] [_args_]

# PARAMETERS

**tag**
> Add tags to files or directories.

**tags** [_file_]
> List all tags, or list tags for a specific file.

**files** _query_
> Query files matching tag expressions (supports and, or, not).

**untag**
> Remove tags from files.

**mount** _mountpoint_
> Mount a FUSE virtual filesystem organized by tags.

**rename** _old_ _new_
> Rename a tag.

**delete** _tag_
> Delete a tag and all its file associations.

**merge** _tags_ _target_
> Merge multiple tags into a single tag.

**status**
> List file tagging status (tagged, modified, missing).

# DESCRIPTION

**tmsu** (Tag My Stuff Unix) is a file tagging tool that lets you organize files by assigning arbitrary tags rather than relying solely on directory hierarchies. Tags and file associations are stored in a local SQLite database, keeping the actual files untouched.

Files can be queried using tag-based expressions with boolean operators (and, or, not), making it easy to find files matching specific criteria. The **mount** command provides a FUSE virtual filesystem where tagged files appear organized into directories by tag, enabling integration with standard file management tools.

# CAVEATS

FUSE needed for mount. Database per directory. Go-based tool.

# HISTORY

**TMSU** (Tag My Stuff Unix) was created for file organization using tags with optional FUSE filesystem support.

# SEE ALSO

[find](/man/find)(1), [locate](/man/locate)(1)
