# TAGLINE

Display URL routing table for Rails application

# TLDR

**List all routes** in the application

```rails routes```

**Search for routes** matching a pattern

```rails routes -g [pattern]```

**Show routes for a specific controller**

```rails routes -c [controller_name]```

**Display routes in expanded format**

```rails routes --expanded```

# SYNOPSIS

**rails routes** [**-g** _pattern_] [**-c** _controller_] [**--expanded**]

# PARAMETERS

**-g**, **--grep** _pattern_
> Filter routes by pattern (matches against name, verb, path, or controller#action)

**-c**, **--controller** _name_
> Show routes for a specific controller only

**--expanded**, **-E**
> Print routes in expanded table format (one attribute per line)

**-h**, **--help**
> Show help information

# DESCRIPTION

**rails routes** displays all routes defined in the Rails application. Routes map incoming URLs to controller actions and are defined in **config/routes.rb**.

The output shows the route name (used for URL helpers), HTTP verb, URL pattern, and the controller#action that handles the request. Named routes can be used with **_path** and **_url** suffixes in views and controllers.

The grep option is useful for large applications with many routes. It searches across all columns, making it easy to find routes by URL pattern, controller name, or route helper name.

# CAVEATS

Must be run from within a Rails application directory. The command loads the application environment, which may take time for large applications.

Routes are displayed in the order they are matched. The first matching route handles the request, so order matters when routes may overlap.

# SEE ALSO

[rails](/man/rails)(1), [rails-server](/man/rails-server)(1), [rake](/man/rake)(1)
