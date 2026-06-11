import base64
import sys

def run_b64(code_b64):
    decoded = base64.b64decode(code_b64).decode("utf-8")
    exec(decoded)

if __name__ == "__main__":
    if len(sys.argv) < 2:
        sys.exit(1)
    run_b64(sys.argv[1])
