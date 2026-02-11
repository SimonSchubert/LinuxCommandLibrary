# TAGLINE

Server-side Swift web framework toolbox

# TLDR

**Create new Vapor project**

```vapor new [ProjectName]```

**Build the project**

```vapor build```

**Run the development server**

```swift run Run serve```

**Run database migrations**

```swift run Run migrate```

**Revert last migration**

```swift run Run migrate --revert```

**Deploy to Heroku**

```vapor heroku init```

# SYNOPSIS

**vapor** _command_ [_options_]

**swift run Run** [_command_] [_options_]

# TOOLBOX COMMANDS

**new** _name_: Generate new Vapor project from template.

**build**: Build the application.

**clean**: Remove temporary build files.

**heroku**: Commands for Heroku deployment.

**--help**: Display available commands.

# RUN COMMANDS

**serve**: Start the HTTP server.

**migrate**: Run pending database migrations.

**routes**: List all registered routes.

**--hostname** _host_: Set server hostname.

**--port** _num_: Set server port.

**--auto-migrate**: Run migrations without confirmation.

# PARAMETERS

**-b** _host:port_
> Bind address shorthand (e.g., localhost:8080).

**--env** _environment_
> Set environment (development, production, testing).

**--log** _level_
> Set log level (trace, debug, info, notice, warning, error, critical).

# DESCRIPTION

**vapor** is the command-line toolbox for the Vapor web framework, a server-side Swift HTTP framework. It manages project creation, building, and deployment workflows for Swift-based web applications.

The toolbox uses Swift Package Manager for dependency management and compilation. Projects are created from templates that include routing, middleware, and optionally Fluent ORM for database operations. The framework provides a non-blocking, event-driven architecture using Swift's async/await concurrency model.

Development typically involves running `swift run Run serve` to start the local server, which watches for changes and serves the application.

# CAVEATS

Requires Swift toolchain and Xcode Command Line Tools on macOS. Linux requires Swift installation. Database drivers (PostgreSQL, MySQL, SQLite) need separate installation. Vapor 4+ requires Swift 5.2 or later.

# HISTORY

**Vapor** was created by Tanner Nelson in 2016 as one of the first major server-side Swift frameworks. It quickly became the most popular Swift web framework. Vapor 4, released in 2020, brought full async/await support and improved performance. The framework is maintained by the Vapor community and used in production by companies worldwide.

# SEE ALSO

[swift](/man/swift)(1), [swiftc](/man/swiftc)(1), [docker](/man/docker)(1)
