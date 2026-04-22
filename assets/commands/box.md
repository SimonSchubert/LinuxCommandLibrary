# TAGLINE

official CLI for interacting with Box cloud storage

# TLDR

**Authenticate** (JWT, OAuth, or CCG, depending on config)

```box login```

**List items** in a folder

```box folders:items [folder_id]```

**Upload a file** to a folder

```box files:upload [file.txt] --parent-id [folder_id]```

**Download a file** by id

```box files:download [file_id]```

**Create a subfolder**

```box folders:create [parent_id] "[folder_name]"```

**Search** content

```box search "[query]"```

**Create a shared link** for a file

```box shared-links:create [file_id] --type file```

**Execute bulk operations** from CSV

```box [command] --bulk-file-path [commands.csv]```

**Act on behalf of another user** (admin only)

```box users:get [user_id] --as-user [user_id]```

**Output as JSON**

```box files:get [file_id] --json```

# SYNOPSIS

**box** _topic_**:**_command_ [_arguments_] [_options_]

# DESCRIPTION

**box** (the **@box/cli** package) is the official Node.js command-line tool for the Box API. It wraps the Box Content API so that technical and non-technical users can perform file, folder, user, and admin operations without writing code.

Commands are grouped by topic, e.g. `files:upload`, `folders:items`, `users:list`, `collaborations:add`. Most commands accept Box identifiers (IDs) rather than paths; `box folders:items 0` lists the root folder. The CLI supports CSV-driven bulk execution via `--bulk-file-path`, letting each row invoke one API call.

# SUBCOMMAND TOPICS

**files** — upload, download, get, update, delete, copy, move, rename, lock, unlock, versions
**folders** — create, get, items, delete, update, copy, move, rename
**search** — search by query across the enterprise
**users** — list, get, create, update, delete, terminate-session
**groups** — list, create, update, delete, memberships
**shared-links** — create/get/update/delete on files, folders, and web links
**collaborations** — add, list, update, remove
**tasks**, **comments**, **web-links**, **metadata**, **legal-holds**, **retention-policies**, **events**, **webhooks**, **terms-of-service**
**configure** — create, switch, import, or set environments (auth configs)

# COMMON OPTIONS

**-h**, **--help**
> Show help for the CLI or a specific command.

**-q**, **--quiet**
> Suppress non-error output to stderr.

**-v**, **--verbose**
> Verbose debug output.

**--as-user** _USER_ID_
> Make the request on behalf of the given user (admin with App User or enterprise auth).

**--token** _TOKEN_
> Use the given OAuth/JWT access token instead of the saved environment.

**--json**
> Output in JSON.

**--csv**
> Output in CSV.

**--save** / **--save-to-file-path** _PATH_
> Save command output to a file.

**--fields** _LIST_
> Comma-separated list of fields to include in the response.

**--bulk-file-path** _FILE_
> Read a CSV/JSON file of input rows and run the command once per row.

**--no-color**
> Disable colored output.

# CONFIGURATION

**~/.box**
> Default directory for saved environments and application auth configs.

**box configure:environments:add** _FILE_
> Adds a new auth environment from a JWT configuration JSON file.

**box configure:environments:switch** _NAME_
> Switches the active environment.

# CAVEATS

Requires Node.js 18+ and a Box developer application (JWT, OAuth 2.0, or Client Credentials Grant) with the scopes needed for the target operations. Many admin commands require an enterprise access token. API rate limits apply.

# HISTORY

The **Box CLI** is maintained by **Box, Inc.** as the official open-source command-line interface for the Box Content API. It is distributed on npm as `@box/cli` (formerly `box-cli`). Repository: github.com/box/boxcli.

# SEE ALSO

[rclone](/man/rclone)(1), [gsutil](/man/gsutil)(1)
