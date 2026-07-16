# TAGLINE

create and manage GitHub Gists from the command line

# TLDR

**Authenticate** once on this computer

```gist --login```

**Create** a public gist from a file

```gist [file.rb]```

**Create** a private gist

```gist -p [file.rb]```

**Create** a gist from standard input, naming the file

```echo "[content]" | gist -f [snippet.txt]```

**Create** a gist with a description

```gist -d "[what this does]" [file.rb]```

**Create** a gist and copy its URL to the clipboard

```gist -c [file.rb]```

**List** your gists

```gist -l```

**Read** a gist to standard output

```gist -r [gist_id]```

**Update** an existing gist

```gist -u [gist_id] [file.rb]```

**Delete** a gist

```gist --delete [gist_id]```

# SYNOPSIS

**gist** [**-p**] [**-d** _description_] [**-t** _extension_] [_file_ ...]

**gist** [**-l** [_user_]] [**-r** _id_] [**-u** _id_] [**--delete** _id_]

# PARAMETERS

**-p**, **--private**
> Make the gist private. Gists are **public** by default.

**--no-private**
> Force a public gist, overriding an earlier **-p**.

**-d**, **--description** _DESCRIPTION_
> Add a description to the gist.

**-f**, **--filename** [_NAME.EXTENSION_]
> Set the filename and syntax type. Mainly useful when reading from standard input.

**-t**, **--type** [_EXTENSION_]
> Set the file extension and syntax type.

**-l**, **--list** [_USER_]
> List gists. With no argument, lists your own; with a username, lists that user's public gists.

**-r**, **--read** _ID_ [_FILENAME_]
> Read a gist and print its contents to standard output.

**-u**, **--update** [_URL_ | _ID_]
> Update an existing gist.

**--delete** [_URL_ | _ID_]
> Delete a gist.

**-c**, **--copy**
> Copy the resulting URL to the clipboard.

**-e**, **--embed**
> Copy the embed code for the gist to the clipboard.

**-o**, **--open**
> Open the resulting URL in a browser.

**--no-open**
> Do not open a browser.

**-P**, **--paste**
> Create the gist from the clipboard contents.

**-R**, **--raw**
> Display the raw URL of the new gist.

**-s**, **--shorten**
> Shorten the gist URL using git.io.

**--skip-empty**
> Skip empty files instead of gisting them.

**--login**
> Authenticate gist on this computer and store a token.

**-h**, **--help**
> Show the help message.

**-v**, **--version**
> Print the version.

# DESCRIPTION

**gist** uploads files to **GitHub Gists** from the command line. Gists are a lightweight way to share code snippets, logs and notes without creating a repository, and each one is a real git repository underneath, with revision history, forking and comments.

Given one or more filenames it uploads them and prints the resulting URL. Given nothing it reads from standard input, which makes it natural at the end of a pipeline: **command | gist -f output.log**. Because the filename determines the syntax highlighting GitHub applies, **-f** or **-t** is worth setting when piping.

Authentication happens once via **gist --login**, which stores an OAuth token in **~/.gist**. Without a token, uploads are anonymous where the API still allows it.

# CONFIGURATION

**~/.gist**
> Stores the OAuth2 access token written by **gist --login**.

**GITHUB_URL**
> Point gist at a GitHub Enterprise instance instead of github.com.

**GIST_CLIENT_ID**
> OAuth client id, enabling the device-code flow against an Enterprise instance.

**GIST_USE_USERNAME_AND_PASSWORD**
> Use the deprecated username and password flow.

**HTTP_PROXY**, **http_proxy**
> Route requests through an HTTP proxy.

**BROWSER**
> Browser used by **-o**.

# CAVEATS

Gists are **public by default**. **-p** makes one private, and there is no way to change the visibility of a gist after it is created, so a snippet uploaded without **-p** is world-readable from the moment it exists. Check before pasting anything with credentials in it.

A "private" (secret) gist is unlisted, not access-controlled: anyone with the URL can read it, and it is not encrypted. Do not treat it as a secret store.

**-c**, **-e** and **-P** need a working clipboard tool, which on Linux means **xclip** or **xsel** being installed.

GitHub's official **gh gist** subcommand covers much of the same ground and ships with the GitHub CLI, so it is the lower-friction choice if you already have **gh** installed and authenticated.

# HISTORY

**gist** is a Ruby gem written by **Chris Wanstrath** (**defunkt**), a GitHub co-founder, and is one of the oldest GitHub command line tools, predating the official **gh** CLI by roughly a decade. It is installed with **gem install gist**.

# SEE ALSO

[gh-gist](/man/gh-gist)(1), [gh](/man/gh)(1), [curl](/man/curl)(1), [xclip](/man/xclip)(1)

# RESOURCES

```[Source code](https://github.com/defunkt/gist)```

<!-- verified: 2026-07-16 -->
