# TAGLINE

Fast local bookmark manager with CLI and TUI

# TLDR

**Launch** the interactive TUI

```bmm```

**Add** a new bookmark

```bmm add "[url]" --title "[title]" --tags "[tag1,tag2]"```

**Search** bookmarks by keyword

```bmm search "[query]"```

**List** all bookmarks

```bmm list```

**Delete** a bookmark by ID

```bmm delete [id]```

**Import** bookmarks from a file

```bmm import [path/to/file]```

# SYNOPSIS

**bmm** [_command_] [_options_]

# PARAMETERS

**add** _URL_
> Add a new bookmark with optional title and tags.

**search** _QUERY_
> Search bookmarks by title, URL, or tags.

**list**
> List all saved bookmarks.

**delete** _ID_
> Delete a bookmark by its ID.

**import** _FILE_
> Import bookmarks from a file.

**export** _FILE_
> Export bookmarks to a file.

**--title** _TEXT_
> Set the title for a bookmark.

**--tags** _TAGS_
> Comma-separated tags for a bookmark.

# DESCRIPTION

**bmm** is a fast, local-first bookmark manager that provides both a command-line interface and an interactive terminal user interface. Bookmarks are stored locally, enabling quick searching, tagging, and organization without relying on cloud services or browsers.

The TUI mode provides an interactive fuzzy-search interface for browsing and managing bookmarks. Bookmarks can be tagged for categorization and exported for backup or sharing.

# CAVEATS

Bookmarks are stored locally and not synced across devices by default. Import formats may be limited to specific file types.

# SEE ALSO

[buku](/man/buku)(1), [nb](/man/nb)(1)
