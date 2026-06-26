# TAGLINE

Local-first document data extraction CLI

# TLDR


**Start** the local ParseHawk service stack

```parsehawk start```


**Check** the service status

```parsehawk status```


**Run a setup** health check

```parsehawk doctor```


**Upload** a document

```parsehawk files upload [document.pdf]```


**Run a one-shot extraction** on a file using an extractor

```parsehawk extract [document.pdf] --extractor [extractor_id]```


**Extract with ad-hoc instructions** and wait for the result

```parsehawk extract [document.pdf] --instructions "[extract invoice total and date]" --wait```


**Stop** the running service

```parsehawk stop```

# SYNOPSIS

**parsehawk** \<command\> [subcommand] [options]

# DESCRIPTION

ParseHawk is a local-first document AI tool that turns documents (PDFs, scans, images, text, and Markdown) into validated, structured JSON. By default it runs entirely on the local machine with no third-party API calls, using a quantized extraction model served through vLLM.

The project ships as three clients over a single backend: a REST API, a web UI, and this command-line interface. The CLI both manages the backend service (**start**, **stop**, **status**) and drives the data workflow (uploading files, defining extractors and schemas, and running extraction jobs). Extraction is zero-shot or few-shot: instead of training a model, the user supplies a JSON Schema, natural-language instructions, and optional examples, and the model returns schema-conformant JSON.

Most data operations require the backend stack to be running, so a typical session begins with **parsehawk start** and ends with **parsehawk stop**.

# COMMANDS

**start**

> Start the ParseHawk service stack.

**stop**

> Stop the running service.

**restart**

> Restart the service.

**status**

> Show whether the service is running.

**doctor**

> Run local setup health checks.

**dev**

> Start in development mode with hot reload.

**extract** \<file\>

> Run a one-shot extraction on a file without creating a separate job.

**files upload** \<file\>

> Upload a document to the service.

**files list**

> List uploaded files.

**files delete** \<file_id\>

> Remove an uploaded file.

**schemas validate** \<schema.json\>

> Validate a JSON Schema file.

**extractors create**

> Define a new set of extraction rules.

**extractors list**

> Show available extractors.

**extractors get** \<extractor_id\>

> Retrieve the details of an extractor.

**extractors delete** \<extractor_id\>

> Remove an extractor.

**jobs create**

> Start an extraction job.

**jobs get** \<job_id\>

> Retrieve the status and results of a job.

**config list**

> Display current settings.

**config set** \<key\> \<value\>

> Change a configuration value.

# PARAMETERS

**--extractor** \<id\>

> Select which extractor to use.

**--file-id** \<id\>

> Select an already-uploaded file as input.

**--schema** \<file\>

> Provide a JSON Schema describing the desired output.

**--instructions** \<text\>

> Give natural-language extraction directives.

**--wait**

> Block until the job completes instead of returning immediately.

**--runtime none**

> Skip local model inference.

# CONFIGURATION

Behavior can be tuned through environment variables, which override defaults:

**PARSEHAWK_VLLM_MAX_MODEL_LEN**

> Maximum model context length (for example, 16384).

**PARSEHAWK_VLLM_GPU_MEMORY_UTILIZATION**

> Fraction of GPU memory the model runtime may use (for example, 0.6).

**PARSEHAWK_VLLM_MAX_NUM_SEQS**

> Maximum number of sequences processed in parallel.

**PARSEHAWK_TELEMETRY_DISABLED**

> Set to 1 to opt out of anonymous usage analytics.

# CAVEATS

The CLI controls a persistent backend service, so most operations need **parsehawk start** to have been run first. Running the local model requires significant resources: roughly 16 GB of unified memory on macOS (Apple Silicon) or 16 GB of VRAM on Linux with an NVIDIA GPU, plus Docker. Windows is not supported. Anonymous usage analytics are sent unless disabled via **PARSEHAWK_TELEMETRY_DISABLED**.

# HISTORY

ParseHawk is built in **Python** (FastAPI backend) with a **React**/**Vite** web UI, and runs its default extraction model (NuExtract3) locally through **vLLM**. It is released under the **Apache-2.0** license.

# SEE ALSO

[tesseract](/man/tesseract)(1), [pdftotext](/man/pdftotext)(1), [jq](/man/jq)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/parsehawk/parsehawk)```

<!-- verified: 2026-06-26 -->
