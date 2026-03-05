# TAGLINE

CLI for executing HTTP, gRPC, WebSocket, and MQTT requests from files

# TLDR

**Execute all requests** in an HTTP file

```httpyac send [path/to/requests.http]```

**Execute all requests** in a directory

```httpyac send [path/to/directory]```

**Execute with a specific environment**

```httpyac send --env [production] [path/to/requests.http]```

**Execute all requests** in a file

```httpyac send --all [path/to/requests.http]```

**Run in interactive mode**

```httpyac send -i [path/to/requests.http]```

# SYNOPSIS

**httpyac** **send** [**--all**] [**--env** _name_] [**-i**] [_options_] _file_

# DESCRIPTION

**httpyac** is a command-line interface for executing requests defined in **.http** and **.rest** files. It supports **HTTP**, **REST**, **GraphQL**, **WebSocket**, **gRPC**, and **MQTT** protocols. The tool provides built-in support for authentication methods including **OAuth2**, **AWS**, **Basic**, **Digest**, and **SSL client certificates**.

httpyac supports variables, environments (including dotenv files), and scripting for complex test scenarios. It can be used for quick one-off requests or automated API testing in CI/CD pipelines.

# CAVEATS

Requires Node.js runtime. Request file format follows the IntelliJ HTTP client specification with extensions. Complex scripting may require familiarity with JavaScript.

# HISTORY

**httpyac** was created by **Andreas Weber** (AnWeber) and is written in **TypeScript/JavaScript**. It is also available as a **VS Code extension** for integrated HTTP request execution within the editor.

# SEE ALSO

[curl](/man/curl)(1), [hurl](/man/hurl)(1), [httpie](/man/httpie)(1)
