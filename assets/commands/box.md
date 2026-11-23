# TAGLINE

official CLI for interacting with Box cloud storage

# TLDR

**Sign in** with OAuth using the official Box CLI app

```box login -d```

**Sign in on a headless machine** (paste the authorization code manually)

```box login -d --code```

**Add an environment** from a JWT/CCG app config file

```box configure:environments:add [path/to/config.json] --set-as-current```

**List items** in a folder

```box folders:items [folder_id]```

**Upload a file** to a folder

```box files:upload [file.txt] --parent-id [folder_id]```

**Upload a new version** over an existing file with the same name

```box files:upload [file.txt] --parent-id [folder_id] --overwrite```

**Download a file** by id

```box files:download [file_id] --destination [path/to/dir]```

**Create a subfolder**

```box folders:create [parent_id] "[folder_name]"```

**Search** content

```box search "[query]"```

**Create a shared link** for a file

```box shared-links:create [file_id] file --access [open]```

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

**files**: upload, download, get, update, delete, copy, move, rename, lock, unlock, versions
**folders**: create, get, items, delete, update, copy, move, rename
**search**: search by query across the enterprise
**users**: list, get, create, update, delete, terminate-session
**groups**: list, create, update, delete, memberships
**shared-links**: create/get/update/delete on files, folders, and web links
**collaborations**: add, list, update, remove
**tasks**, **comments**, **web-links**, **metadata**, **legal-holds**, **retention-policies**, **events**, **webhooks**, **terms-of-service**
**configure**: add, list, select, update, or delete environments (auth configs) and change CLI settings
**login** / **logout**: OAuth 2.0 sign-in that creates an environment, and token revocation

# COMMON OPTIONS

**-h**, **--help**
> Show help for the CLI or a specific command.

**-q**, **--quiet**
> Suppress non-error output to stderr.

**-v**, **--verbose**
> Verbose debug output.

**--as-user** _USER_ID_
> Make the request on behalf of the given user (admin with App User or enterprise auth).

**-t**, **--token** _TOKEN_
> Use the given OAuth/JWT access token instead of the saved environment.

**--json**
> Output in JSON.

**--csv**
> Output in CSV.

**-s**, **--save** / **--save-to-file-path** _PATH_
> Save command output to the default reports folder, or to the given file.

**-y**, **--yes**
> Automatically answer yes to all confirmation prompts.

**--fields** _LIST_
> Comma-separated list of fields to include in the response.

**--bulk-file-path** _FILE_
> Read a CSV or JSON file of input rows and run the command once per row.

**--no-color**
> Disable colored output.

# CONFIGURATION

**~/.box**
> Default directory for saved environments; CLI settings live in `~/.box/settings.json`.

**box configure:environments:add** _FILE_
> Adds a new auth environment from a JWT (or, with `--ccg-auth`, CCG) app configuration JSON file.

**box configure:environments:set-current** [_NAME_]
> Switches the active environment (interactive picker without an argument).

**box configure:settings**
> Shows or changes CLI-wide settings such as proxy, output format, and reports folder.

# CAVEATS

Requires Node.js 18+ when installed through npm. `box login -d` needs no app of your own but is limited to content scopes; enterprise and admin operations need your own Box developer application (JWT, OAuth 2.0, or Client Credentials Grant) with the scopes needed for the target operations. Many admin commands require an enterprise access token. API rate limits apply.

# HISTORY

The **Box CLI** is maintained by **Box, Inc.** as the official open-source command-line interface for the Box Content API. It is built on the oclif framework and distributed on npm as `@box/cli`, with standalone installers for Windows and macOS.

# SEE ALSO

[rclone](/man/rclone)(1), [gsutil](/man/gsutil)(1)

# RESOURCES

```[Source code](https://github.com/box/boxcli)```

```[Documentation](https://developer.box.com/guides/cli)```

<!-- verified: 2026-11-23 -->
