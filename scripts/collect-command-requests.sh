#!/bin/bash
#
# Collects command names from GitHub issues labeled "command-request",
# deduplicates against existing commands, appends new ones to commands.txt,
# and comments/closes each issue with the result.
#
# Usage: ./scripts/collect-command-requests.sh
# Requires: gh CLI (authenticated)

set -euo pipefail

REPO_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
COMMANDS_FILE="$REPO_ROOT/commands.txt"
PROCESSED_FILE="$REPO_ROOT/commands_processed.txt"
IGNORE_FILE="$REPO_ROOT/commands_ignore.txt"
COMMANDS_DIR="$REPO_ROOT/assets/commands"

# Fetch open issues with the command-request label
issues=$(gh issue list --label "command-request" --state open --json number,body --limit 100)
count=$(echo "$issues" | jq length)

if [ "$count" -eq 0 ]; then
    echo "No open command-request issues found."
    exit 0
fi

echo "Found $count command-request issue(s)."

echo "$issues" | jq -c '.[]' | while read -r issue; do
    number=$(echo "$issue" | jq -r '.number')
    body=$(echo "$issue" | jq -r '.body')

    echo ""
    echo "--- Issue #$number ---"

    # Extract command names from the "Command names" section
    # The template puts commands in the first textarea, so we parse lines from the body
    # Strip the "### Command names" and "### Additional context" headers,
    # take lines between them, and extract non-empty trimmed lines
    commands_section=$(echo "$body" | sed -n '/### Command names/,/### Additional context/p' | grep -v '^###' | grep -v '^_No response_$')

    added=()
    skipped=()

    while IFS= read -r line; do
        # Trim whitespace, skip empty lines and markdown artifacts
        cmd=$(echo "$line" | sed 's/^[[:space:]]*//;s/[[:space:]]*$//' | tr -d '`')
        [ -z "$cmd" ] && continue

        # Check if already processed
        if grep -qxF "$cmd" "$PROCESSED_FILE" 2>/dev/null; then
            skipped+=("- \`$cmd\` - already in the library")
            echo "  SKIP (processed): $cmd"
            continue
        fi

        # Check if already ignored
        if grep -qxF "$cmd" "$IGNORE_FILE" 2>/dev/null; then
            skipped+=("- \`$cmd\` - not a valid Linux command")
            echo "  SKIP (ignored): $cmd"
            continue
        fi

        # Check if markdown already exists
        if [ -f "$COMMANDS_DIR/$cmd.md" ]; then
            skipped+=("- \`$cmd\` - already in the library")
            echo "  SKIP (exists): $cmd"
            continue
        fi

        # Check if already queued in commands.txt
        if grep -qxF "$cmd" "$COMMANDS_FILE" 2>/dev/null; then
            skipped+=("- \`$cmd\` - already queued for processing")
            echo "  SKIP (queued): $cmd"
            continue
        fi

        # Add to commands.txt
        echo "$cmd" >> "$COMMANDS_FILE"
        added+=("- \`$cmd\`")
        echo "  ADDED: $cmd"
    done <<< "$commands_section"

    # Build comment
    comment=""
    if [ ${#added[@]} -gt 0 ]; then
        comment+="**Successfully queued for addition:**"$'\n'
        for a in "${added[@]}"; do
            comment+="$a"$'\n'
        done
        comment+=$'\n'"These commands will be added to the library in an upcoming update."$'\n'
    fi
    if [ ${#skipped[@]} -gt 0 ]; then
        if [ -n "$comment" ]; then
            comment+=$'\n'
        fi
        comment+="**Skipped:**"$'\n'
        for s in "${skipped[@]}"; do
            comment+="$s"$'\n'
        done
    fi
    if [ -z "$comment" ]; then
        comment="No valid command names found in this issue. Please list command names one per line."
    fi

    comment+=$'\n'"Thanks for contributing!"

    # Comment and close the issue
    gh issue comment "$number" --body "$comment"
    gh issue close "$number"
    echo "  Commented and closed issue #$number"
done

echo ""
echo "Done. Run your instructions-man.md workflow to generate the markdown files."
