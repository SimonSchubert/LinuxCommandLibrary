# TAGLINE

Terminal note taking with journals, tasks, and Zettelkasten

# TLDR

**Add a journal entry**

```nkt log [journal_name]```

**Read notes**

```nkt read [note_name]```

**Edit a note**

```nkt edit [note_name]```

**List all notes**

```nkt list```

# SYNOPSIS

**nkt** _command_ [_options_] [_arguments_]

# DESCRIPTION

**nkt** is a terminal note-taking tool that combines journals, notes, task lists, and habit chains. It draws inspiration from Dendron, jrnl, vim-wiki, and methods like Zettelkasten and "Don't break the chain."

Features include timestamped journal entries, fuzzy finding across all notes (similar to fzf), tag-based organization with **@tag** syntax, task management, and linking between notes for easy navigation.

# CAVEATS

Notes are stored locally. The project has moved from GitHub to sourcehut.

# HISTORY

**nkt** was created by **fjebaker** and is written in **Zig**.

# SEE ALSO

[nb](/man/nb)(1), [jrnl](/man/jrnl)(1)
