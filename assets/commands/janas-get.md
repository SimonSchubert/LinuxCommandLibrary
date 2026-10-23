# TAGLINE

Download and convert Janas-LLM catalog models

# TLDR

**List** the models the catalog knows

```janas-get list```

**Download** a converted model into the default folder

```janas-get [gemma-4-e4b]```

Put files in a **different directory**

```janas-get [qwen3-4b] --dir [./models]```

Download the original **GGUF** and convert it locally

```janas-get [qwen3-4b] --from-gguf```

Keep the GGUF **after** conversion

```janas-get [qwen3-4b] --from-gguf --keep```

Fetch a **Hugging Face** file by path

```janas-get [hf:owner/repo/file.jns]```

Skip the model's **prediction** file or draft

```janas-get [qwen3-4b] --no-mtp```

# SYNOPSIS

**janas-get** **list**

**janas-get** _model_ [**--dir** _DIR_] [**--no-mtp**] [**--from-gguf** [**--keep**]]

**janas-get** **hf:**_owner_/_repo_/_file_ [**--dir** _DIR_] [**--keep**]

# DESCRIPTION

**janas-get** downloads a model already converted to Janas's **.jns** format from the project's Hugging Face account ([prabanta-dev](https://huggingface.co/prabanta-dev)), with its prediction file or draft when the catalog names one, and checks the SHA-256 of every file against **MODELS.md** in the Janas tree.

Files go to `~/.local/share/janas/models`, or wherever **JANAS_MODELS** or **--dir** says. A download stopped halfway resumes; a file already there is checked rather than fetched again. **janas-chat** then finds the model by catalog name.

By default the converted file is fetched. **--from-gguf** takes the original GGUF the catalog names, downloads it, and converts it on this machine to the same fingerprints; the GGUF is deleted once converted unless **--keep**. **janas-get** uses that path by itself when a converted file is not on Hugging Face.

**hf:**_owner_/_repo_/_file_ fetches any `.jns` or `.gguf` from Hugging Face, checked against the SHA-256 Hugging Face lists for it.

`janas-get list` prints each catalog name, download size, and the smallest machine that model is meant for.

# PARAMETERS

**list**
> Print the catalog.

_model_
> A catalog name such as **qwen3-4b** or **gemma-4-e4b**.

**hf:**_owner_/_repo_/_file_
> A Hugging Face object (`.jns` or `.gguf`).

**--dir** _DIR_
> Where the models go (default **JANAS_MODELS**, or `~/.local/share/janas/models`).

**--no-mtp**
> Without the model's prediction file or draft.

**--from-gguf**
> Download the original GGUF and convert it here.

**--keep**
> Keep the downloaded GGUF once converted.

# CAVEATS

Converted models are large (from under 1 GB to about 48 GB for Qwen3-Next-80B). Conversion needs room for both the GGUF and the `.jns` at once, about twice the model. Keep `.jns` files on an NVMe SSD: experts are read from disk while the model answers. A converted `.jns` is a derivative of the model, not of Janas, and keeps the licence its authors gave it. IQ2 and IQ1 GGUF types are not converted.

# HISTORY

**janas-get** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (first public release **September 2026**, GNU GPL 3 or later).

# SEE ALSO

[janas-chat](/man/janas-chat)(1), [janas-bench](/man/janas-bench)(1), [janas-server](/man/janas-server)(1), [gguf2jns](/man/gguf2jns)(1), [hf2jns_mtp](/man/hf2jns_mtp)(1), [jns_planes](/man/jns_planes)(1), [huggingface-cli](/man/huggingface-cli)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/docs/models.md)```

<!-- verified: 2026-10-13 -->
