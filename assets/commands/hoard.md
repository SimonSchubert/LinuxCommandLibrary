# TAGLINE

CLI command organizer for saving and recalling snippets

# TLDR

**Save a new command** to hoard

```hoard new```

**List and search saved commands**

```hoard list```

**Edit a saved command**

```hoard edit```

**Remove a saved command**

```hoard remove```

**Save a parameterized command** with placeholders

```hoard new --name "[name]" --command "curl -X POST #url# -d #data#"```

# SYNOPSIS

**hoard** _command_ [_options_]

# DESCRIPTION

**hoard** is a CLI command organizer that saves commands you frequently use but are too complicated or long to remember. For every hoarded command, it saves the command parameterized with a customizable token (default **#**), so when you select a command, hoard asks for all missing parameters before sending the complete command to your shell.

When a **trove.yml** file is present in the local directory, hoard loads only that file, enabling project-specific command collections. It can be installed as a shell plugin for autocomplete integration.

# CONFIGURATION

Commands are stored in a **trove.yml** file. Global configuration supports customizing the parameter token, default namespace, and shell integration settings.

# CAVEATS

Shell plugin installation is required for full autocomplete and inline execution features. Parameterized commands use a simple token replacement that doesn't support complex templating.

# HISTORY

**hoard** was created by **Hyde46** and is written in **Rust**. It was designed to solve the problem of remembering complex CLI commands by providing a quick-access organized collection with parameter substitution.

# SEE ALSO

[pet](/man/pet)(1), [navi](/man/navi)(1), [tldr](/man/tldr)(1)
