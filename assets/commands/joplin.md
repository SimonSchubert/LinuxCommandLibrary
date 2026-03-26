# TAGLINE

open-source note-taking application supporting Markdown

# TLDR

**Start Joplin terminal app**

```joplin```

**Create a new note**

```joplin mknote "[Note Title]"```

**Create a new notebook**

```joplin mkbook "[Notebook Name]"```

**List all notebooks**

```joplin ls /```

**List notes in a notebook**

```joplin ls [notebook]```

**Edit a note in your text editor**

```joplin edit "[note title]"```

**Search for notes**

```joplin search "[query]"```

**Sync with cloud storage**

```joplin sync```

**Add a tag to a note**

```joplin tag add "[tag]" "[note title]"```

# SYNOPSIS

**joplin** [_command_] [_options_]

# PARAMETERS

**mknote** _title_
> Create new note.

**mkbook** _name_
> Create new notebook.

**ls** [_path_]
> List notebooks or notes.

**edit** _note_
> Edit note in editor.

**cat** _note_
> Display note content.

**rmnote** _note_
> Delete note.

**mv** _note_ _notebook_
> Move note.

**sync**
> Synchronize with cloud.

**tag** _command_ [_tag_] [_note_]
> Manage tags (add, remove, list, notetags).

**search** _query_
> Search notes.

**import** _path_ [_notebook_]
> Import data (supports md, jex, enex formats).

**export** _path_
> Export data (supports jex, md, raw, md_frontmatter formats).

**ren** _item_ _name_
> Rename a note or notebook.

**cp** _note_ [_notebook_]
> Duplicate a note to a notebook.

**mktodo** _title_
> Create a new to-do item.

**done** _note_
> Mark a to-do as done.

**undone** _note_
> Mark a to-do as not done.

**config** _key_ [_value_]
> Get/set configuration.

**status**
> Display summary of notes and notebooks.

**use** _notebook_
> Select default notebook.

# DESCRIPTION

**Joplin** is an open-source note-taking application supporting Markdown. The terminal version provides command-line access to notes, complementing the desktop and mobile apps.

Joplin supports end-to-end encryption, sync via Nextcloud/Dropbox/OneDrive/Joplin Cloud, and import from Evernote. Notes are stored in Markdown format and can be tagged and organized into notebooks.

# SYNC CONFIGURATION

```bash
joplin config sync.target 2  # Nextcloud
joplin config sync.2.path "https://..."
joplin config sync.2.username "user"
```

# CAVEATS

Terminal version lacks some GUI features. Sync requires configuration. First sync may take time. Conflicts possible with simultaneous edits.

# HISTORY

Joplin was created by **Laurent Cozic** in **2017** as an open-source Evernote alternative. It emphasizes privacy with end-to-end encryption and local-first storage.

# SEE ALSO

[vim](/man/vim)(1), [notable](/man/notable)(1)
