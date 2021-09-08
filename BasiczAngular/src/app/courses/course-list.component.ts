import { Component, OnInit } from "@angular/core";
import { Course } from "./course";

@Component(
    {
        selector: 'app-course-list'
        , templateUrl: './course-list.component.html'
    }
)
export class CourseListComponent implements OnInit{
    //list/Array of Courses
    courses: Course[] = [];

    /*Has the objective to load information. Override from OnInit interface */
    ngOnInit (): void{
        this.courses = [
            {
                id: 1,
                name: "My course ANGULAR",
                imageUrl: "URL to image ANGULAR",
                price: 0,
                code: "CRS-01",
                duration: 12,
                rating: 4,
                releaseDate: "2021-07-02"
            },
            {
                id: 2,
                name: "My course HTML",
                imageUrl: "URL to image HTML",
                price: 0,
                code: "CRS-02",
                duration: 8,
                rating: 4.5,
                releaseDate: "2021-08-25"
            }
        ]
    }
}