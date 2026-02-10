# TAGLINE

simple command-line journal application for recording daily thoughts

# TLDR

**Write a quick journal entry**

```jrnl [Today was a good day.]```

**Write entry with specific date**

```jrnl [yesterday]: [Had a great meeting.]```

**Open editor** to write longer entry

```jrnl```

**List recent entries**

```jrnl -n [10]```

**Search entries** containing text

```jrnl -contains "[search term]"```

**Show entries with specific tag**

```jrnl @[tag]```

**Show entries from a date range**

```jrnl -from "[2024-01-01]" -to "[2024-01-31]"```

**Edit the last entry**

```jrnl --edit -1```

# SYNOPSIS

**jrnl** [_entry_] | [_-n count_] [_-from date_] [_-to date_] [_-contains text_] [_@tag_] [_--edit_] [_--export format_]

# PARAMETERS

**-n**, **--limit** _count_
> Show only the last n entries.

**-from** _date_
> Show entries from this date onwards.

**-to** _date_
> Show entries up to this date.

**-on** _date_
> Show entries on specific date.

**-contains** _text_
> Show entries containing text.

**-and**
> Require all filter conditions (default: any).

**-starred**
> Show only starred entries.

**--edit**
> Open entries in editor.

**--delete**
> Delete matching entries.

**--export** _format_
> Export entries (json, markdown, text, xml, yaml, tags).

**--import** _file_
> Import entries from file.

**--format** _format_
> Output format for display.

**--tags**
> List all tags.

**--short**
> Show only entry titles.

**--config-override** _key value_
> Override config setting.

**-ls**
> List available journals.

# DESCRIPTION

**jrnl** is a simple command-line journal application for recording daily thoughts, notes, and ideas. It stores entries in plain text, making them portable and future-proof.

Entries consist of a date, optional title (first sentence), and body text. Tags are created by prefixing words with @ (e.g., @work, @idea). The first line or sentence before a period becomes the entry title, displayed in listings.

Quick entries can be typed directly on the command line. Running jrnl without arguments opens your configured editor for longer entries. Date parsing is natural language aware: "yesterday", "last friday", "2 days ago" work as expected.

Configuration is stored in **~/.config/jrnl/jrnl.yaml**, defining the journal file location, editor, encryption settings, and multiple journals. You can maintain separate journals (work, personal, etc.) and switch between them.

Encryption with AES-256 is available for sensitive journals, requiring a password to read or write entries. Entries can be exported to various formats for backup or migration.

# CAVEATS

Plain text storage means entries are readable without jrnl. Encryption adds password requirement for every access. Date parsing may occasionally misinterpret complex dates. Multiple journals require explicit selection. No built-in sync - use file sync tools for multi-device.

# HISTORY

**jrnl** was created by Manuel Ebert around **2012** as a simple journaling tool for the command line. It was inspired by the Day One journaling app but designed for terminal users who prefer plain text. The project has been maintained by the open-source community and remains popular for its simplicity and Unix philosophy adherence.

# SEE ALSO

[taskwarrior](/man/taskwarrior)(1), [note](/man/note)(1), [vim](/man/vim)(1), [nano](/man/nano)(1)
