# TAGLINE

Redirect application file paths using Linux namespaces.

# TLDR

**Run application with file redirection rules**

```boxxy [application]```

**Use custom configuration file**

```boxxy --config [boxxy.yaml] [application]```

**Add rule at command line**

```boxxy --rule "[rule_name]:~/.config/app:~/.local/share/app" [application]```

**Scan homedir for rule suggestions**

```boxxy --scan```

**Run without loading config files**

```boxxy --no-config [application]```

# SYNOPSIS

**boxxy** [_options_] [_application_] [_arguments_]

# DESCRIPTION

**boxxy** puts misbehaving Linux applications in a box, forcing them to put their files and directories in the right place without symlinks. It uses Linux namespaces to redirect file operations transparently.

The tool is designed to manage applications that create dotfiles or directories in unwanted locations, redirecting them to XDG-compliant paths or other preferred locations.

# PARAMETERS

**--config** _file_
> Use specified configuration file

**--rule** _rule_
> Add rule at command line (format: name:target:rewrite)

**--no-config**
> Disable loading configuration files

**--scan**
> Scan home directory and suggest rules

**--context** _path_
> Set context directory for rule application

# CONFIGURATION

Rules in boxxy.yaml include:

**name**
> User-friendly rule identifier

**target**
> File or directory to shadow

**rewrite**
> Replacement file or directory

**mode**
> Either "directory" or "file" (default: directory)

**commands**
> Optional list of commands the rule applies to

# CAVEATS

Requires Linux namespaces support (Linux kernel). Rules must specify mode when the target is a file, especially if the target doesn't exist yet. Project-local boxxy.yaml files and .env files can be loaded automatically.

# SEE ALSO

[firejail](/man/firejail)(1), [bubblewrap](/man/bubblewrap)(1), [unshare](/man/unshare)(1)
