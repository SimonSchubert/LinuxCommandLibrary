# TAGLINE

Self-hosted media organizer and metadata server

# TLDR

**Start** the Stash server on the default port (9999)

```stash```

**Bind** the server to a specific host and port

```stash --host [127.0.0.1] --port [9999]```

**Use** a custom configuration file

```stash -c [path/to/config.yml]```

**Use** a custom CPU profile path

```stash --cpuprofile [path/to/cpu.prof]```

**Run** with a generated configuration directory

```STASH_CONFIG_FILE=[/data/config.yml] stash```

**Show** the version and exit

```stash --version```

# SYNOPSIS

**stash** [_flags_]

# PARAMETERS

**--host** _host_
> Hostname or interface to bind to (default **0.0.0.0**).

**--port** _port_
> TCP port to listen on (default **9999**).

**-c**, **--config** _file_
> Path to the **config.yml** file. Overrides the default location.

**--cpuprofile** _file_
> Write a Go CPU profile to _file_ for performance analysis.

**--nobrowser**
> Do not automatically open the web UI on first start.

**--version**
> Print Stash version information and exit.

**-h**, **--help**
> Show available flags and exit.

# DESCRIPTION

**Stash** is an open-source, self-hosted web application written in **Go** that organizes and serves a personal media library. It indexes video and image collections, scrapes metadata from configured sources (StashDB, ThePornDB, community scrapers), and exposes a rich web UI on **http://localhost:9999** with tagging, performers, studios, galleries, statistics, and a GraphQL API.

The **stash** binary launches the HTTP/GraphQL server, schedules background scan, generate, and identify tasks, and persists state to a SQLite database. Plugins extend the server with custom tasks, scrapers, and UI hooks via Python, JavaScript, or shell scripts.

Stash is single-user by default but supports password-protected access. **FFmpeg** and **FFprobe** are bundled at first run if not already present and are required for transcoding, sprite generation, and previews.

# CONFIGURATION

The server reads its configuration from **~/.stash/config.yml** by default. Override this with **-c** _file_ or the **STASH_CONFIG_FILE** environment variable. Flag and environment variable values take precedence over the YAML file.

Frequently set options (in **config.yml**):

> **host** / **port** — listen address.
> **stash** — list of library paths to scan.
> **database** — path to the SQLite database (default **~/.stash/stash-go.sqlite**).
> **generated** — directory for generated previews and sprites.
> **cache** — directory for transcode and image caches.
> **username** / **password** — credentials for the web UI.
> **plugins_path** / **scrapers_path** — locations for community plugins and scrapers.

# CAVEATS

The default bind address is **0.0.0.0**, which exposes the UI to the local network — set **host** to **127.0.0.1** or enable authentication before exposing it. Stash is community-maintained and frequently updated; back up **config.yml** and the SQLite database before upgrades. The name **stash** clashes with **git stash** (a git subcommand, not a standalone binary), with the deprecated **Atlassian Stash** (now **Bitbucket Server**), and with several smaller CLIs — make sure you installed the correct **stashapp/stash** release.

# HISTORY

Stash was started in **2018** by **WithoutPants** as an open-source alternative to commercial media managers. The project moved to the **stashapp** GitHub organization and grew a large community of plugin and scraper contributors. It is distributed as a single static binary for **Linux**, **macOS**, and **Windows**, with an official Docker image, under the **AGPL-3.0** license.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [jellyfin](/man/jellyfin)(1), [plex](/man/plex)(1)
