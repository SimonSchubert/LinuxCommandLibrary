# TAGLINE

manage and export secret values

# TLDR

**List all secrets**

```doppler secrets```

**Get specific secret**

```doppler secrets get [SECRET_NAME]```

**Set a secret**

```doppler secrets set [KEY]=[value]```

**Delete a secret**

```doppler secrets delete [SECRET_NAME]```

**Print one secret's raw value**, for scripting

```doppler secrets get [SECRET_NAME] --plain```

**Dump secrets to stdout** as a dotenv file

```doppler secrets download --no-file --format [env]```

**Upload an existing .env** file into a config

```doppler secrets upload [.env]```

**Render a template** with secrets substituted in

```doppler secrets substitute [template.yaml]```

# SYNOPSIS

**doppler secrets** [_subcommand_] [_arguments_] [_flags_]

# SUBCOMMANDS

(none)
> Print a table of every secret in the current project and config.

**get** [_secrets_...]
> Get the value of one or more secrets.

**set** [_secrets_...]
> Set the value of one or more secrets. Called with only a name, it prompts for the value interactively.

**delete** [_secrets_...]
> Delete one or more secrets.

**download** [_filepath_]
> Download a config's secrets for later use. Without **--no-file** it writes an *encrypted* fallback file.

**upload** _filepath_
> Upload a secrets file, importing everything in it.

**substitute** _filepath_
> Substitute secrets into a template file.

# PARAMETERS

**-p**, **--project** _NAME_ / **-c**, **--config** _NAME_
> Project and config to act on, overriding whatever `doppler setup` selected for this directory.

**--plain**
> Print values with no table formatting. Essential when capturing a value in a script.

**--only-names**
> Print secret names and omit every value.

**--raw**
> Print the raw stored value without resolving secret references.

**--copy**
> Copy the value to the clipboard (**get**).

**--format** _FORMAT_
> Output format for **download**: `json` (the default), `env`, `yaml`, `docker`, and others.

**--no-file**
> Print the response to stdout instead of writing a file.

**--visibility** _LEVEL_
> Set a secret's visibility on **set**: `masked`, `unmasked`, or `restricted`.

**-y**, **--yes**
> Proceed without a confirmation prompt (**delete**).

**--fallback** _PATH_, **--fallback-only**, **--no-fallback**
> Control the encrypted fallback file that lets secrets still be read when Doppler is unreachable.

**--json**
> Print the result as JSON.

# DESCRIPTION

**doppler secrets** is the read/write interface to the secrets in a Doppler config. Run with no subcommand it prints a table of everything in the config selected by `doppler setup`, with values masked.

**download** is the export path. It defaults to **JSON** and, without **--no-file**, writes an *encrypted* fallback file rather than a plaintext one, which is a deliberate safety choice: the usual way to get a plaintext dotenv onto stdout is `doppler secrets download --no-file --format env`.

Secrets may reference one another with `${OTHER_SECRET}` syntax, and the CLI resolves those references before printing. **--raw** shows the stored text instead, which is what you want when copying a value between configs.

**substitute** renders a Go template file with the config's secrets available as variables, which covers the common case of generating a Kubernetes manifest or a config file that expects real values rather than environment variables.

# CAVEATS

Anything printed by **get --plain** or **download --no-file** is plaintext on your terminal and in your shell history; prefer `doppler run` so that values never touch disk. **download** writing an encrypted file by default surprises people who expect a readable `.env`. **delete** is immediate and there is no undo, though the change is recorded in the activity log. Writes need a token with write access, and read-only service tokens will fail on **set** and **delete**.

# HISTORY

**doppler secrets** is the core of the Doppler CLI and dates from the product's first release. The design that stuck, keeping secrets out of `.env` files on disk and injecting them at process start instead, is what the rest of the CLI is built around; the encrypted fallback file was added so that this remained safe when the network or the API is unavailable.

# INSTALL

```brew: brew install doppler```

```nix: nix profile install nixpkgs#doppler```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[doppler](/man/doppler)(1), [doppler-projects](/man/doppler-projects)(1), [vault](/man/vault)(1), [sops](/man/sops)(1)

# RESOURCES

```[Source code](https://github.com/DopplerHQ/cli)```

```[Homepage](https://www.doppler.com)```

```[Documentation](https://docs.doppler.com/docs/cli)```

<!-- verified: 2026-07-14 -->

