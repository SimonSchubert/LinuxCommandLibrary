# TAGLINE

Datalevin database CLI, REPL, and server

# TLDR

**Start** an interactive Datalevin REPL

```dtlv```

**Show** help for all commands

```dtlv help```

**Run** as a network server

```dtlv serv```

**Copy** (backup) a database directory, compacting pages in use

```dtlv -d [source_db_dir] -c copy [dest_db_dir]```

**Dump** a Datalog database to a file

```dtlv -d [db_dir] -g -f [dump_file] dump```

**Execute** Clojure code against a database in a script

```dtlv exec '(def conn (get-conn "/tmp/db")) (q (quote [:find ?e :where [?e :name _]]) @conn) (close conn)'```

**Run** the local MCP server over stdio

```dtlv mcp```

# SYNOPSIS

**dtlv** [_options_] [_command_] [_arguments_]

# DESCRIPTION

**dtlv** is the native command-line tool for **Datalevin**, a durable Datalog database built on LMDB. One binary covers an interactive Clojure REPL, shell-oriented database maintenance, query/transaction execution, an optional networked server, and a stdio MCP server for AI clients.

Without arguments (or with **repl**), **dtlv** starts a SCI-based interactive console where Datalevin public functions are available without requiring namespaces—the same Clojure APIs used in libraries. **exec** runs code from arguments or stdin for scripting. Maintenance commands include **copy** (hot-capable backup, optional compact), **dump**/**load** (text or nippy export/import), **drop**, and **stat**. **serv** listens for client connections (default **127.0.0.1:8898**, data root **/var/lib/datalevin** on POSIX). **mcp** exposes Datalevin over the Model Context Protocol.

Install via Homebrew (**huahaiy/brew/datalevin**), release binaries, Docker (**huahaiy/datalevin**), or the JVM uberjar. The same executable can also load as a Babashka pod.

# PARAMETERS

**repl**
> Enter the interactive shell (default when no command is given).

**exec** [_code_]
> Execute Datalevin/Clojure code from the argument or standard input.

**copy**
> Copy a database directory. Requires **-d** source path; destination is the argument. **-c**/**--compact** copies only pages in use.

**dump**
> Dump database content to stdout or **-f** file. **-g** Datalog-only; **-n** nippy binary; **-a** all sub-databases; **-l** list sub-database names.

**load**
> Load data from stdin or **-f** into the database at **-d**.

**drop**
> Clear or (**-D**) delete sub-databases.

**stat**
> Display database statistics.

**serv**
> Run as a server. **--host**, **-p**/**--port**, **-r**/**--root**, **-v** verbose.

**mcp**
> Run an MCP server over stdio. **-w**/**--allow-writes** enables write tools (off by default).

**help** [_command_]
> Show usage.

**-d**, **--dir** _PATH_
> Database directory path.

**-f**, **--file** _PATH_
> Input/output file for dump/load and related operations.

**-V**, **--version**
> Show Datalevin version and exit.

# CAVEATS

Native **dtlv** is built with GraalVM SerialGC and may be less suitable than the JVM uberjar for long-running, highly concurrent servers. Binding **serv** to a non-loopback address requires **DATALEVIN_DEFAULT_PASSWORD**. Default server account credentials must be changed for any exposed deployment. **mcp** write tools stay disabled until **--allow-writes**.

# HISTORY

Datalevin is an open-source Datalog store (Eclipse Public License) by Huahai Yang and contributors, developed for simple durable Datalog with competitive query performance. The **dtlv** native image and server mode landed early in the project roadmap and remain the primary ops interface.

# SEE ALSO

[bb](/man/bb)(1), [sqlite3](/man/sqlite3)(1), [java](/man/java)(1)

# RESOURCES

```[Source code](https://github.com/datalevin/datalevin)```

```[Homepage](https://datalevin.org)```

```[Documentation](https://github.com/datalevin/datalevin/blob/master/doc/dtlv.md)```

<!-- verified: 2026-07-22 -->
