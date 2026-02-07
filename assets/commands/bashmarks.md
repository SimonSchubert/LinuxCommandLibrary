# TAGLINE

Directory bookmarking for the shell

# TLDR

**Save** current directory bookmark

```s [bookmark-name]```

**Go** to bookmark

```g [bookmark-name]```

**List** bookmarks

```l```

**Delete** bookmark

```d [bookmark-name]```

# SYNOPSIS

bashmarks directory bookmarking functions

# DESCRIPTION

**bashmarks** is a bash script that provides directory bookmarking functionality. It allows you to save frequently-used directory paths with short names and jump to them quickly.

The tool adds convenient shell functions for managing and navigating to bookmarked directories.

# FUNCTIONS

**s** _name_
> Save current directory as bookmark

**g** _name_
> Go to bookmarked directory

**l**
> List all bookmarks

**d** _name_
> Delete bookmark

**p** _name_
> Print bookmark path

# FEATURES

- Simple bookmark management
- Tab completion for bookmarks
- Persistent storage
- Integration with bash/zsh

# WORKFLOW

```bash
# Save bookmark
cd /var/log/apache2
s apache

# Jump to bookmark
g apache

# List all
l

# Remove
d apache
```

# CAVEATS

Requires sourcing in shell config. Bookmark names must be simple (no spaces or special chars). Different from z or autojump which use frequency. Must be installed separately.

# HISTORY

**bashmarks** was created by Huy Nguyen around **2010** to provide simple directory bookmarking for bash users.

# SEE ALSO

[z](/man/z)(1), [autojump](/man/autojump)(1), [fasd](/man/fasd)(1)
