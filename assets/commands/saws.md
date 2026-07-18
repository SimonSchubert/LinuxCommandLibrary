# TAGLINE

Supercharged interactive AWS CLI with fuzzy completion

# TLDR

**Start** the SAWS shell

```saws```

**Then run AWS commands** with completion (inside SAWS)

```aws [ec2] [describe-instances]```

**List S3** with bucket completion

```aws s3 ls s3://```

# SYNOPSIS

**saws**

# DESCRIPTION

**saws** is a productivity layer around the official AWS CLI. You launch an interactive session that supports the same **aws** *command* *subcommand* structure, but adds fuzzy auto-completion of commands, subcommands, options, and live AWS resources (S3 buckets, EC2 instance ids/tags, and more), plus syntax highlighting, fish-style suggestions, shortcuts, history, and contextual help.

It requires a working AWS CLI installation and standard AWS credentials / profiles. Configuration and theme live in **~/.sawsrc** and related files.

# PARAMETERS

**saws** is primarily interactive. Once running, type normal AWS CLI commands:

**aws** *service* *operation* [*options*]

> Same surface as **aws**, with enhanced completion.

Shortcuts and toolbar options are documented upstream. **F-keys** / toolbar toggles control features such as fuzzy matching and docs shortcuts (see project README).

# CAVEATS

Project activity may lag current AWS CLI feature velocity—verify compatibility with your AWS CLI v1/v2 install. Resource completion needs network permission to enumerate account resources. Not a separate API client: failures often originate from **aws** itself or IAM permissions.

# SEE ALSO

[aws](/man/aws)(1), [aws-shell](/man/aws-shell)(1)

# RESOURCES

```[Source code](https://github.com/donnemartin/saws)```

```[Documentation](https://saws.readthedocs.org/)```

<!-- verified: 2026-07-19 -->
