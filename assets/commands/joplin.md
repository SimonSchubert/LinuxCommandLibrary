# TLDR

**Start Joplin terminal app**

```joplin```

**Create new note**

```joplin mknote "[Note Title]"```

**Create notebook**

```joplin mkbook "[Notebook Name]"```

**List notebooks**

```joplin ls /```

**List notes in notebook**

```joplin ls [notebook]```

**Edit note**

```joplin edit "[note title]"```

**Sync with cloud**

```joplin sync```

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

**rm** _note_
> Delete note.

**mv** _note_ _notebook_
> Move note.

**sync**
> Synchronize with cloud.

**config** _key_ [_value_]
> Get/set configuration.

**use** _notebook_
> Select default notebook.

# DESCRIPTION

**Joplin** is an open-source note-taking application supporting Markdown. The terminal version provides command-line access to notes, complementing the desktop and mobile apps.

Joplin supports end-to-end encryption, sync via Nextcloud/Dropbox/OneDrive, and import from Evernote. Notes are stored in Markdown format.

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

[vim](/man/vim)(1), [obsidian](/man/obsidian)(1), [notable](/man/notable)(1)
