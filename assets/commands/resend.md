# TAGLINE

Email API CLI for sending emails and managing webhooks

# TLDR

**Authenticate** with your Resend account

```resend login```

**Send an email** with subject and body

```resend emails send --from [sender@example.com] --to [recipient@example.com] --subject "[Hello]" --text "[Message body]"```

**Check API key** and verify domain readiness

```resend doctor```

**Start a local webhook** listener

```resend webhooks listen```

**Create a webhook** for production events

```resend webhooks create```

**Send an email** with HTML body

```resend emails send --from [sender@example.com] --to [recipient@example.com] --subject "[Hello]" --html "[<h1>Hello</h1>]"```

# SYNOPSIS

**resend** _command_ [_options_]

# PARAMETERS

**login**
> Authenticate with your Resend account via the browser.

**doctor**
> Verify API key validity, list verified domains, and check readiness.

**emails send**
> Send an email with specified sender, recipient, subject, and body.

**webhooks listen**
> Start a local server on port 4318 to capture and display incoming webhook events.

**webhooks create**
> Register a new webhook endpoint for production environments.

**--from** _address_
> Sender email address.

**--to** _address_
> Recipient email address.

**--subject** _text_
> Email subject line.

**--text** _body_
> Plain text email body.

**--html** _body_
> HTML email body.

**--forward-to** _url_
> Forward webhook payloads to a local server, preserving signature headers.

**--version**
> Show version information.

**--help**
> Show available commands and options.

# DESCRIPTION

**resend** is the official CLI for the Resend email API. It enables sending transactional emails, managing webhooks, and diagnosing account configuration directly from the terminal. The CLI is designed for developers, CI/CD pipelines, and AI agent workflows.

In non-interactive mode, output is formatted as JSON with consistent exit codes, making it suitable for scripting and automation. Errors include structured **message** and **code** fields for programmatic handling.

The webhook listener (**resend webhooks listen**) creates a local development server that captures incoming events and streams them to the terminal, useful for testing email event handlers without deploying to production.

# CAVEATS

Requires a Resend account and API key for authentication. Sending emails requires a verified domain. The webhook listener needs Tailscale for exposing local ports to the internet during development. The CLI outputs JSON in non-interactive mode but human-readable text in interactive mode.

# HISTORY

**Resend** was founded by **Zeno Rocha** as a modern email API for developers, offering an alternative to legacy transactional email services. The CLI was built to complement the REST API and SDKs, providing terminal-based access to all core email operations. It is written in **TypeScript** and distributed via npm and Homebrew.

# SEE ALSO

[mail](/man/mail)(1), [sendmail](/man/sendmail)(1), [curl](/man/curl)(1)
