# TAGLINE

RSS/Atom feed automation tool

# TLDR

**Fetch all configured feeds**

```feed2exec fetch```

**Add a new feed**

```feed2exec add [feedname] [https://example.com/feed.xml]```

**List configured feeds**

```feed2exec ls```

**Remove a feed**

```feed2exec rm [feedname]```

**Run with custom config**

```feed2exec --config [~/.config/feed2exec.ini] fetch```

# SYNOPSIS

**feed2exec** [_options_] _command_ [_args_]

# PARAMETERS

**fetch**
> Fetch and process all feeds.

**add** _name_ _url_
> Add new feed.

**rm** _name_
> Remove feed.

**ls**
> List configured feeds.

**parse** _url_
> Parse feed without processing.

**--config** _file_
> Configuration file path.

**--verbose**, **-v**
> Verbose output.

**--debug**
> Debug output.

# CONFIGURATION

**~/.config/feed2exec.ini**
> Main configuration file defining feeds, output formats, and processing commands.

# DESCRIPTION

**feed2exec** fetches RSS/Atom feeds and executes commands for each new entry. It's a flexible feed processor that can send emails, run scripts, save files, or trigger any command based on feed updates.

Unlike feed readers, feed2exec is designed for automation. Common uses include email notifications, archiving, and triggering webhooks when feeds update.

# CAVEATS

Requires configuration for each feed. State tracked in SQLite database. Email sending needs configured MTA. Complex outputs may need custom plugins.

# HISTORY

feed2exec was written by **Antoine Beaupré** as a flexible replacement for rss2email and similar tools. It emphasizes Unix philosophy, executing external commands rather than implementing every feature internally.

# SEE ALSO

[rss2email](/man/rss2email)(1), [newsboat](/man/newsboat)(1), [curl](/man/curl)(1)
