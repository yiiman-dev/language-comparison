package main

import (
    "fmt"
    "time"
)

func main() {
    endNumber := 1000000000
    startTime := time.Now()

    for i := 1; i <= endNumber; i++ {
        if i == endNumber {
            elapsed := time.Since(startTime)
            fmt.Printf("End after %v milliseconds\n", elapsed.Milliseconds())
        }
    }
}

