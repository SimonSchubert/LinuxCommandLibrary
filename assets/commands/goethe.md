# TAGLINE

Serve local models and an API gateway from the shell

# TLDR

Guided setup: install a model, serve it, and choose who can call it

```goethe start```

Start Goethe now and at **boot**

```goethe up```

Start now **without** enabling boot

```goethe up --no-boot```

Show whether it is running

```goethe status```

Stop it and turn off start-at-boot

```goethe down```

Models that **fit** this machine

```goethe recommend```

Download a model and **load** it

```goethe install --model [zai-org/GLM-5.3-Flash] --load```

Create an API **key**

```goethe key --create [my-app]```

Print the API address and a sample request

```goethe api```

# SYNOPSIS

**goethe** _command_ [_options_]

# PARAMETERS

**start**

> Start Goethe, then walk through installing a model, serving it, and configuring access. Without a terminal, print the equivalent commands

**up** [**--no-boot**]

> Start Goethe and the API gateway, and enable start at boot. Models that were loaded last time come back. **--no-boot** starts once and does not enable boot

**status**

> Whether Goethe is running, the API address, and the names and ids of API keys

**down** [**--keep-engines**]

> Stop Goethe and its models, and disable start at boot. **--keep-engines** leaves models serving while Goethe itself restarts

**service** **enable** | **disable** | **status** | **restore** **--on** | **--off**

> Control start-at-boot, and whether loaded models return when Goethe starts

**recommend** [**--json**]

> Catalog models that fit the GPUs Goethe may use

**install --model** _id-or-folder_ [**--load**] [**--ctx** _n_] [**--gpu** _gpuN_...]

> Download a Hugging Face repository, or register a local folder. **--load** serves it after install. **--yes** loads beside other GPU programs without asking. **--hf-token** asks for a token for this download only and does not store it

**models** [**--installed** | **--available**] [**--json**]

> Installed models, then the catalog. **list** is an alias

**load --model** _id_

> Load a model and wait until it answers. Extra engine options go after `--`

**unload --model** _id_

> Unload a model

**ps** [**--json**]

> Running models, their GPUs, and in-flight requests

**logs** [**--model** _id_] [**-f**] [**-n** _n_]

> Model log, or **--daemon** / **--gateway** for Goethe's own logs. The default line count is 100

**configure api** [**--mode** _local_|_vpn_|_public_]

> Choose who can reach the API: this machine, a VPN address, or a public address

**api** [**--json**]

> API address, authentication, served models, keys, and a curl example

**key** [**--create** _name_] [**--revoke** _id_]

> List keys, create one, or revoke by id. **--raw** prints only the new secret. **--rpm** defaults to 120 (0 is unlimited)

**gpu** [**--allow** _gpuN_...] [**--deny** _gpuN_...]

> Show GPUs and whether new models may use them

**doctor**

> Check GPU, driver, compiler, Python, gateway, ports, and keys

**--help**

> Help for the top level or for one command (`goethe` _command_ `--help`)

**--version**

> Print the version

# DESCRIPTION

**goethe** manages a local model server and the HTTP gateway in front of it. Model ids are Hugging Face repository names such as `zai-org/GLM-5.3-Flash`. Case does not matter, and the on-disk folder form with a double underscore between owner and name is accepted too. A mistyped id gets a suggestion. Commands that list things accept **--json**.

Every value follows its flag. A bare value prints the corrected command instead of running. GPUs are named `gpu0`, `gpu1`, and so on, matching `goethe gpu`.

Exit codes: 0 success, 1 error, 2 wrong usage, 3 a confirmation was required but there is no terminal (pass **--yes**).

The installer published with the project is a shell script from meshapplied.com, not a distro package. `goethe update` and `goethe uninstall` manage that install. `goethe doctor` is the check after setup.

# CAVEATS

**install --load** and **load** occupy GPU memory. **--yes** skips the question about other programs already on that GPU. **remove** deletes files Goethe downloaded. A folder you only registered is unregistered, not deleted.

**key --create** prints a secret. **--raw** is for scripts. Do not log it. **configure api --mode public** exposes the gateway beyond localhost.

A package named `goethe` in a distro archive is not this server. Do not install an unrelated package to get this binary.

# HISTORY

Goethe is Mesh Applied's local model runner and API gateway. The command reference lives in the repository as `docs/cli.md`, next to the user guide. The source repository is meshapplied/goethe.

# SEE ALSO

[python3](/man/python3)(1)

# RESOURCES

```[Source code](https://github.com/meshapplied/goethe)```

```[Homepage](https://meshapplied.com)```

```[Documentation](https://meshapplied.com/docs)```

<!-- verified: 2026-11-07 -->
