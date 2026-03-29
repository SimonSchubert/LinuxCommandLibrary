# TAGLINE

Server-side Swift web framework toolbox

# TLDR

**Create new Vapor project**

```vapor new [ProjectName]```

**Create project with a custom template**

```vapor new [ProjectName] --template [https://github.com/user/template.git]```

**Create project with automatic "no" to all prompts**

```vapor new [ProjectName] -n```

**Create project in a specific output directory**

```vapor new [ProjectName] --output [path/to/directory]```

**Create project without initializing a Git repository**

```vapor new [ProjectName] --no-git```

# SYNOPSIS

**vapor** [**new**] [_options_] [_name_]

# PARAMETERS

**-n**
> Automatically answer "no" to all interactive questions.

**--output** _path_
> Specify a custom folder location for the new project.

**--template** _url_
> Use a custom template from a Git repository URL.

**--branch** _name_
> Specify a different Git branch for the template (default: main).

**--no-git**
> Skip Git repository initialization.

**--no-commit**
> Initialize Git but skip the initial commit.

**--help**
> Display help information.

# DESCRIPTION

**vapor** is the command-line toolbox for the Vapor web framework, a server-side Swift HTTP framework. The toolbox's primary purpose is creating new Vapor projects from templates. The **new** command is the default subcommand and can be omitted.

Projects are created from templates that include routing, middleware, and optionally Fluent ORM for database operations. The toolbox supports dynamic project generation through manifest files (YAML or JSON) that define variables and conditional file inclusion based on user responses.

Once a project is created, you use Swift Package Manager directly (`swift build`, `swift run`) to build and run the application.

# CAVEATS

Requires Swift toolchain and Xcode Command Line Tools on macOS. Linux requires Swift installation. The toolbox requires macOS 15.0+ or a Linux distribution supported by Swift 6.1+. Database drivers (PostgreSQL, MySQL, SQLite) are added as Swift package dependencies.

# HISTORY

**Vapor** was created by Tanner Nelson in 2016 as one of the first major server-side Swift frameworks. It quickly became the most popular Swift web framework. Vapor 4, released in 2020, brought full async/await support and improved performance. The framework is maintained by the Vapor community and used in production by companies worldwide.

# SEE ALSO

[swift](/man/swift)(1), [swiftc](/man/swiftc)(1), [docker](/man/docker)(1)
