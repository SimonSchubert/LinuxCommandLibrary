# TAGLINE

Browse and control the SQLite prompt log used by llm

# TLDR

Show the **3 most recent** prompts and replies

```llm logs list```

Show the **10 most recent** entries

```llm logs list -n 10```

**Search** prompts and responses

```llm logs list -q "[cheesecake]"```

Print only the **latest reply** as plain text

```llm logs list -r```

Show whether logging is **on** and the database size

```llm logs status```

Turn logging **off** (or back **on**)

```llm logs off```

```llm logs on```

Print the **logs.db** path

```llm logs path```

**Back up** the database

```llm logs backup [path/to/backup.db]```

# SYNOPSIS

**llm logs** [_options_] [_command_]

**llm logs list** [_options_]

**llm logs status**

**llm logs on**

**llm logs off**

**llm logs path**

**llm logs backup** _file_

# PARAMETERS

**list**
> Show logged prompts and responses. Default subcommand (**llm logs**). Markdown of the last **3** entries unless **-n** is set.

**-n**, **--count** _N_
> Number of entries. Default **3**. **0** means all.

**-q**, **--query** _text_
> SQLite FTS5 search over prompt and response text (not system prompts, fragment bodies, tool output, or reasoning). Prompt matches rank above response matches. Phrase queries use double quotes.

**-l**, **--latest**
> With **-q**, sort newest first instead of by relevance.

**-m**, **--model** _id_
> Filter by model id or alias.

**-c**, **--current**
> Current conversation only.

**--cid**, **--conversation** _id_
> One conversation / thread id.

**-r**, **--response**
> Print only the last response as plain text.

**-s**, **--short**
> Compact YAML: truncated prompts, no responses.

**-t**, **--truncate**
> Truncate long strings (handy with **--json**).

**-u**, **--usage**
> Include token counts.

**--json**
> JSON array of log records (legacy **responses** rows merged with the current message store).

**-x**, **--extract** / **--xl**, **--extract-last**
> First or last fenced code block from the selected entries.

**-d**, **--database** _file_
> Alternate log database.

**-f**, **--fragment** _ref_
> Responses that used this fragment (hash, alias, URL, or path). Repeatable (AND). **-e** / **--expand** inlines fragment text.

**-T**, **--tool** _name_
> Responses that actually ran this tool. Repeatable. **--tools** matches any tool result.

**--schema** / **--schema-multi**
> Filter by structured-output schema. **--data**, **--data-array**, **--data-key**, **--data-ids** extract JSON payloads.

**--id-gt** / **--id-gte** _id_
> Rows with id greater than (or equal to) _id_. Ids increase with time.

**status**
> Whether default logging is on, plus path, thread/turn counts, and file size.

**on** / **off**
> Default logging for future prompts. A single call still honors **llm --log** / **llm --no-log**.

**path**
> Absolute path of **logs.db**.

**backup** _file_
> Copy the database with SQLite **VACUUM INTO**.

# DESCRIPTION

**llm logs** reads the SQLite database where **llm** records prompts and model replies. The default file is **logs.db** in the LLM user directory (**llm logs path**). **datasette "$(llm logs path)"** is the documented browser for that file.

Current LLM versions write a content-addressed store (**threads**, **turns**, **messages**, **parts**). Older **responses** rows stay visible: **llm logs** merges both generations. Search uses FTS5 over the user prompt and assistant text.

# CONFIGURATION

**logs.db**
> Linux: **~/.config/io.datasette.llm/logs.db**. macOS: **~/Library/Application Support/io.datasette.llm/logs.db**.

**LLM_USER_PATH**
> Relocates the user directory, including logs.

# CAVEATS

Subcommand of **llm**. Logs are plaintext (prompts, replies, and often secrets pasted into chats). **-q** does not search system prompts, fragment contents, or reasoning traces. **off** only changes the default; **--log** still records one call. Backup files contain the same secrets as **logs.db**.

# INSTALL

```brew: brew install llm```

```nix: nix profile install nixpkgs#llm```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[llm](/man/llm)(1), [llm-keys](/man/llm-keys)(1), [llm-models](/man/llm-models)(1), [datasette](/man/datasette)(1), [sqlite3](/man/sqlite3)(1)

# RESOURCES

```[Source code](https://github.com/simonw/llm)```

```[Homepage](https://llm.datasette.io)```

```[Documentation](https://llm.datasette.io/en/stable/logging.html)```

<!-- verified: 2026-09-28 -->
