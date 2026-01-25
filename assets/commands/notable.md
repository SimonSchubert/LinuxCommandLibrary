# TLDR

**Start Notable**

```notable```

**Open specific data directory**

```notable --data-dir [~/notes]```

**Import notes**

```notable --import [notes/]```

# SYNOPSIS

**notable** [_options_]

# PARAMETERS

**--data-dir** _path_
> Notes directory.

**--import** _path_
> Import notes.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**Notable** is a Markdown-based note-taking application. It stores notes as plain Markdown files, supports tags, attachments, and provides a clean editing interface.

Notable is available as a desktop app built with Electron.

# FEATURES

```
- Markdown notes
- Tags and notebooks
- Split editor/preview
- KaTeX math support
- Mermaid diagrams
- Multi-note editor
```

# DATA STRUCTURE

```
notes/
├── Notes/           # Markdown files
├── Attachments/     # Attached files
└── notable.json     # Metadata
```

# CAVEATS

Electron-based (resource usage). Free version has limitations. Notes stored locally only.

# HISTORY

Notable was created by **Fabio Spampinato** in **2018** as a markdown-native note-taking app inspired by Sublime Text.

# SEE ALSO

[joplin](/man/joplin)(1), [obsidian](/man/obsidian)(1), [typora](/man/typora)(1), [zettlr](/man/zettlr)(1)
