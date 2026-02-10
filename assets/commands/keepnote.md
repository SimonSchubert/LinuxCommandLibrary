# TAGLINE

note-taking application

# TLDR

**Start KeepNote**

```keepnote```

**Open notebook**

```keepnote [notebook_path]```

**Open specific page**

```keepnote [notebook_path] --page [page_id]```

# SYNOPSIS

**keepnote** [_options_] [_notebook_]

# PARAMETERS

_NOTEBOOK_
> Path to notebook directory.

**--page** _ID_
> Open specific page.

**--version**
> Show version.

**--help**
> Display help information.

# DESCRIPTION

**KeepNote** is a desktop note-taking application that organizes notes into hierarchical, tree-structured notebooks with rich text formatting support. Notes can contain styled text, images, hyperlinks, and file attachments, making it suitable for research documentation, journaling, and technical notes. The GTK-based interface presents a familiar three-pane layout with a notebook tree, page list, and editor.

Notebooks are stored on disk as directories of HTML files and associated resources, which makes them easy to back up, version control, or browse outside of the application. Each note is a self-contained HTML document, so the data format remains accessible even without KeepNote installed. The application is written in Python and supports full-text search across all notes within a notebook.

# CAVEATS

Python/GTK application. Development slowed. Consider alternatives like Joplin.

# HISTORY

KeepNote was created by **Matt Rasmussen** as an open-source note-taking application with hierarchical organization.

# SEE ALSO

[joplin](/man/joplin)(1), [zim](/man/zim)(1), [cherrytree](/man/cherrytree)(1)
