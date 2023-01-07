package app.fb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    
    private String id;

    private String post;
    private String name;
    private String email;
    private String image;
    private String file;
    private String profilePic;
    private String timeStamp;
    private String imageName;
}
